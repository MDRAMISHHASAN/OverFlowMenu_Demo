 package com.devramisha.overflowmenudemo;

import android.graphics.Color;
import android.os.Bundle;

//import com.google.android.material.floatingactionbutton.FloatingActionButton;
//import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
//import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;

//import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        ConstraintLayout mainview = findViewById(R.id.main_view);

        switch (item.getItemId())
        {
            case R.id.menu_red:
                item.setChecked(true);
                mainview.setBackgroundColor(Color.RED);
                return true;

            case R.id.menu_green:
                item.setChecked(true);
                mainview.setBackgroundColor(Color.GREEN);
                return true;

            case R.id.menu_blue:
                item.setChecked(true);
                mainview.setBackgroundColor(Color.BLUE);
                return false;
        }
        mainview.setBackgroundColor(Color.GREEN);
        return super.onOptionsItemSelected(item);
    }
}
