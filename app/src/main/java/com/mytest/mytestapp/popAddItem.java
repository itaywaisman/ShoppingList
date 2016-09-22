package com.mytest.mytestapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;

import com.mytest.mytestapp.R;

/**
 * Created by Gal EP on 21/09/2016.
 */
public class popAddItem extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pop_add_item);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;
        int hight = dm.heightPixels;
        getWindow().setLayout((int)(width*0.8),(int)(hight*0.55));
    }
}
