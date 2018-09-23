package com.materialdesign.materialdesignapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class ActionBarToolbar extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return  true;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_bar_toolbar);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("Action Bar as ToolBar");
        toolbar.setSubtitle("by Victor Lijoodi");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(this, item.getTitle() + " selected!", Toast.LENGTH_LONG).show();

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
}
