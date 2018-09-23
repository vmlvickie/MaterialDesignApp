package com.materialdesign.materialdesignapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ContextualMenu extends AppCompatActivity {

    Button button;
    ActionMode actionMode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contextual_menu);
        Toolbar mToolBar = (Toolbar) findViewById(R.id.toolbar);
        mToolBar.setTitle("Stand alone ToolBar");
        mToolBar.setSubtitle("by Victor Lijoodi");

        button = (Button) findViewById(R.id.button);
        mToolBar.inflateMenu(R.menu.main_menu);

        mToolBar.setOnMenuItemClickListener( new Toolbar.OnMenuItemClickListener(){

            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Toast.makeText(ContextualMenu.this, item.getTitle() + " selected!", Toast.LENGTH_LONG).show();

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
    button.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            //instantiate the ActionMode
            actionMode = ContextualMenu.this.startActionMode(new ContextualCallback());
        }
    });
    }

    class ContextualCallback implements ActionMode.Callback{
        @Override
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            actionMode.getMenuInflater().inflate(R.menu.contextual_menu, menu);

            return true;
        }

        @Override
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            actionMode.setTitle("My Action mode");
            actionMode.setSubtitle("by Victor Lijoodi");
            return false;
        }

        @Override
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        @Override
        public void onDestroyActionMode(ActionMode actionMode) {

        }
    }
}
