package com.materialdesign.materialdesignapp;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(Build.VERSION.SDK_INT >=Build.VERSION_CODES.LOLLIPOP){
            //apply some material design feature
        }else{
            //implement without material design
        }
    }

    public void showStandAloneToolBar(View view){
        Intent i = new Intent(this, StandAloneToolbar.class);
        startActivity(i);
    }
    public void showToolBarAsActionBar(View view){
        Intent i = new Intent(this, ActionBarToolbar.class);
        startActivity(i);
    }
    public void showContextualMenu(View view){
        Intent i = new Intent(this, ContextualMenu.class);
        startActivity(i);
    }
}
