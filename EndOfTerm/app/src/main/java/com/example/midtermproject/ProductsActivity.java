package com.example.midtermproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class ProductsActivity extends AppCompatActivity {

    private Button act_rate;
    private Button act_match;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);
        addListenerOnButton();


    }

    public void addListenerOnButton (){

        act_rate = (Button)findViewById(R.id.rate);
        act_match = (Button)findViewById(R.id.match);

        act_rate.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(".ThirdActivity");
                        startActivity(intent);
                    }
                }
        );

        act_match.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(".DashBoardActivity");
                        startActivity(intent);
                    }
                }
        );
    }
}