package com.materialdesign.materialdesignapp;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

public class StandAloneToolbar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stand_alone_toolbar);

        Toolbar mToolBar = (Toolbar) findViewById(R.id.toolbar);
        mToolBar.setTitle("Stand alone ToolBar");
        mToolBar.setSubtitle("by Victor lijoodi");
        //mToolBar.setNavigationIcon(R.drawable.navigation_back);//set the navigation back


        //Compatibility by JAVA
   /*     if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            mToolBar.setElevation(10f);
        }*/

        mToolBar.inflateMenu(R.menu.main_menu);
        mToolBar.setOnMenuItemClickListener( new Toolbar.OnMenuItemClickListener(){

            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Toast.makeText(StandAloneToolbar.this, item.getTitle() + " selected!", Toast.LENGTH_LONG).show();

                switch (item.getItemId()){
                    case R.id.settings:
                        break;
                    case R.id.save:
                        break;
                    case R.id.email:
                        break;
                    case R.id.logout:
                        break;
                }
                return true;
            }
        });
    }
}
