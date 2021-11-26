package com.example.activity_lifecycleanil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
TextView txt;
private static final String TAG =MainActivity.class.getCanonicalName ();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        txt = findViewById ( R.id.txt );
        Log.i ( "lifecycle","onCreate invoked" );

    }
protected void onStart(){
        super.onStart ();
        Log.i ( "LifeCycle","onStart invoked" );

}

protected void onResume(){
        super.onResume ();
        Log.i ( "LifeCycle","onResume invoked" );

}
protected void onPause(){
        super.onPause ();
        Log.i ( "LifeCycle","onPause invoked" );

}
protected  void onStop(){
        super.onStop ();
        Log.i ( "LifeCycle","onStop invoked" );
}

protected void onRestart(){
        super.onRestart ();
        Log.i ( "LifeCycle","onRestart invoked" );

}
protected void onDestroy(){
        super.onDestroy ();
        Log.i ( "LifeCycle","onDestroy invoked" );

}

    }
