package com.rohksin.flurrytest;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.rohksin.flurry.Flurry;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Flurry flurry = (Flurry)findViewById(R.id.flurry);
        List<Integer> images = new ArrayList<Integer>();
        images.add(R.drawable.abc);
        images.add(R.drawable.med);
        flurry.addImageList(images);
        flurry.autoStart(3000);
    }


}
