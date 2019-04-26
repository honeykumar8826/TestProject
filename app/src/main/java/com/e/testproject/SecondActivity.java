package com.e.testproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
private TextView tvHide,tvShow;
private ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        back = findViewById(R.id.button_back);
        tvHide = findViewById(R.id.textview_toolbar_title);
        tvShow = findViewById(R.id.textview_toolbar_title1);
        tvHide.setVisibility(View.GONE);
        tvShow.setVisibility(View.VISIBLE);
        back.setVisibility(View.VISIBLE);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
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
