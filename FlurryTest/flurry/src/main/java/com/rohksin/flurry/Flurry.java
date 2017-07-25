package com.rohksin.flurry;

import android.content.Context;
import android.os.AsyncTask;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import java.util.List;

/**
 * Created by Illuminati on 7/25/2017.
 */

public class Flurry extends FrameLayout {

private List<Integer> carouselImages;
private Button prev;
private Button next;
private int index = 0;

private Context context;
private AppCompatActivity activity;
private FragmentManager manager;
private FragmentTransaction transaction;

private static int PREV =0;
private static int NEXT =1;

private static int DEFAULT_TIME = 2000;


public Flurry(Context context) {
        super(context);
        initialize(context);
        }

public Flurry(Context context, AttributeSet attrs) {
        super(context, attrs);
        initialize(context);
        }

public Flurry(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initialize(context);
        }

private void initialize(Context context) {
        View view = inflate(context, R.layout.carosel_view, this);
        activity = (AppCompatActivity) context;

        manager = (activity).getSupportFragmentManager();

        prev = (Button) findViewById(R.id.prev);
        next = (Button) findViewById(R.id.next);
        hideButton();

        prev.setOnClickListener(new OnClickListener() {
@Override
public void onClick(View v) {

                /*
                if (index > 0) {
                    Fragment fragment = createFragment(givePrev());
                    transaction = manager.beginTransaction();
                    transaction.setCustomAnimations(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
                    transaction.replace(R.id.main_content, fragment).commit();
                    checkButtonVisibility();
                }
                */

        int value = getCaroselIndex(PREV);
        Log.d("VALUE", value + "");
        Fragment fragment = createFragment(value);
        transaction = manager.beginTransaction();
        transaction.setCustomAnimations(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        transaction.replace(R.id.main_content, fragment).commit();


        }
        });

        next.setOnClickListener(new OnClickListener() {
@Override
public void onClick(View v) {

                /*
                if (index < carouselImages.size() - 1) {
                    Fragment fragment = createFragment(giveNext());
                    transaction = manager.beginTransaction();
                    transaction.setCustomAnimations(R.anim.slide_in_right, R.anim.slide_out_left);
                    transaction.replace(R.id.main_content, fragment).commit();
                    checkButtonVisibility();
                }
                */
        int value = getCaroselIndex(NEXT);
        Log.d("VALUE", value + "");
        Fragment fragment = createFragment(value);
        transaction = manager.beginTransaction();
        transaction.setCustomAnimations(R.anim.slide_in_right, R.anim.slide_out_left);
        transaction.replace(R.id.main_content, fragment).commit();

        }
        });
        }

public void addImageList(List<Integer> carouselImages) {
        this.carouselImages = carouselImages;
        if (carouselImages != null) {
           /* Fragment fragment = createFragment(this.carouselImages.get(0));
            manager.beginTransaction().add(R.id.main_content, fragment).commit();
            checkButtonVisibility();
            */
        showButton();
        Fragment fragment = createFragment(0);
        manager.beginTransaction().add(R.id.main_content, fragment).commit();
        }

        }

private void showButton() {
        if (carouselImages != null) {
        prev.setVisibility(View.VISIBLE);
        next.setVisibility(View.VISIBLE);
        }
        }

private void hideButton() {
        prev.setVisibility(View.INVISIBLE);
        next.setVisibility(View.INVISIBLE);
        }

private int giveNext() {
        if (index != carouselImages.size() - 1) {
        index++;
        }
        Log.d("INDEX", index + " " + carouselImages.size());
        return carouselImages.get(index);
        }

private int givePrev() {
        if (index > 0) {
        index--;
        }
        Log.d("INDEX", index + " " + carouselImages.size());
        return carouselImages.get(index);
        }


private void hideLeft() {
        prev.setVisibility(View.INVISIBLE);
        }

private void hideRight() {
        next.setVisibility(View.INVISIBLE);
        }

private void showLeft() {
        prev.setVisibility(View.VISIBLE);
        }

private void showRight() {
        next.setVisibility(View.VISIBLE);
        }

private void checkButtonVisibility() {
        if (index == 0) {
        Log.d("HIDE", "0  " + index);
        hideLeft();
        showRight();
        } else if (index == carouselImages.size() - 1) {
        Log.d("HIDE", "1");
        showLeft();
        hideRight();
        } else {
        Log.d("HIDE", "2");
        showButton();
        }
        }





private int getCaroselIndex(int Action)
        {

        ////FOR SLIDER MAKE USE OF THIS METHOD

        if(Action==PREV)
        {
        if(index==0)
        return (index = carouselImages.size()-1);
        else
        return --index;
        }else
        {
        if(index == carouselImages.size()-1)
        return (index=0);
        else
        return ++index;
        }


        }


private Fragment createFragment(int index) {

        Fragment fragment = new ImageFragment().createInstance(carouselImages.get(index));
        return fragment;
        }


public void autoStart()
        {
        new AutoStart(DEFAULT_TIME).execute();
        }

public void autoStart(int milisSecond)
        {
        new AutoStart(milisSecond).execute();
        }


private class AutoStart extends AsyncTask<Void,Integer,Void> {

    private int milis;

    public AutoStart(int milis)
    {
        this.milis = milis;
    }

    @Override
    protected Void doInBackground(Void... image) {

        try {

            while(true) {
                Thread.sleep(milis);
                publishProgress(1);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    protected void onProgressUpdate(Integer... values)
    {
        Fragment fragment = createFragment(getCaroselIndex(NEXT));
        transaction = manager.beginTransaction();
        transaction.setCustomAnimations(R.anim.slide_in_right, R.anim.slide_out_left);
        transaction.replace(R.id.main_content, fragment).commit();
    }
}


}