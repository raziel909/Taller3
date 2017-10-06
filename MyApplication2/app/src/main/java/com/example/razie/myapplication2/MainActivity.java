package com.example.razie.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.opencv.android.OpenCVLoader;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="MainActivity";

    static {
        if(!OpenCVLoader.initDebug()){
            Log.i(TAG,"No se cargo OpenCV");
        }else {
            Log.i(TAG, "Se cargo Opencv");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
