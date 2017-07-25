package com.rohksin.flurry;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Illuminati on 7/14/2017.
 */
public class ImageFragment extends Fragment {


    private static int layout1;

    public static ImageFragment createInstance(int layout)
    {
        Bundle bundle = new Bundle();
        layout1 = layout;
        ImageFragment fragment = new ImageFragment();
        fragment.setArguments(bundle);
        Log.d("Frag Null",(fragment==null)+"");
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup parent,Bundle bundle)
    {
        super.onCreateView(inflater,parent,bundle);
        View v = inflater.inflate(R.layout.image_fragment,parent,false);

        ImageView imageView = (ImageView)v.findViewById(R.id.carouselImage);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),layout1);
        //imageView.setImageResource(layout1);
        imageView.setImageBitmap(bitmap);
        return v;

    }

}
