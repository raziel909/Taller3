package com.example.razie.holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import org.opencv.android.OpenCVLoader;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="MainActivity";


    // Used to load the 'native-lib' library on application startup.
    static {
        if(!OpenCVLoader.initDebug()){
            Log.d(TAG,"No se cargo OpenCV :)");
        }else {
            Log.d(TAG, "Se cargo Opencv :(");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
