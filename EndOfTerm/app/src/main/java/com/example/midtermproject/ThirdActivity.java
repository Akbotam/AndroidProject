package com.example.midtermproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    private RatingBar rating;
    private TextView text_show;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        rating = (RatingBar)findViewById(R.id.rate);
        text_show = (TextView)findViewById(R.id.txtshow);

        rating.setOnRatingBarChangeListener(
                new RatingBar.OnRatingBarChangeListener() {
                    @Override
                    public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                        text_show.setText("Value: " + String.valueOf(rating));
                    }
                }
        );
    }



}
