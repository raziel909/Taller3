package com.example.razie.myapplicationcpp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.opencv.android.OpenCVLoader;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    private static final String TAG ="MainActivity";

    static {
        if(!OpenCVLoader.initDebug()){
            Log.d(TAG,"No se cargo OpenCV");
        }else {
            Log.d(TAG, "Se cargo Opencv");
        }
        System.loadLibrary("native-lib");
    }

    //static {
        //System.loadLibrary("native-lib");
    //}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        TextView tv = (TextView) findViewById(R.id.sample_text);
        tv.setText(stringFromJNI());
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}
