package com.sarkarinaukri24.practical10;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        txt = findViewById(R.id.txt);
        switch (item.getItemId()) {
            case R.id.Item1:
                txt.setText("Item1");
                return true;
            case R.id.Item2:
                txt.setText("Item2");
                return true;
            case R.id.Item3:
                txt.setText("Item3");
                return true;
            case R.id.Item4:
                txt.setText("Item4");
                return true;
            case R.id.Item5:
                txt.setText("Item5");
                return true;

            default:
                return super.onOptionsItemSelected(item);

        }

    }
}