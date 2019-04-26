package com.e.testproject;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Toolbar mToolbar;
private LinearLayout lClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar = findViewById(R.id.toolbar);
        lClick = findViewById(R.id.first_item);
        lClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });




    }

    public void navSettting(View view) {
        Toast.makeText(this, "This is setting click", Toast.LENGTH_SHORT).show();
    }

    public void navExplore(View view) {
        Toast.makeText(this, "This is Explore click", Toast.LENGTH_SHORT).show();

    }

    public void navFav(View view) {
        Toast.makeText(this, "This is Fav click", Toast.LENGTH_SHORT).show();

    }
}
