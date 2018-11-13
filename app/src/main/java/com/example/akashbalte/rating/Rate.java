package com.example.akashbalte.rating;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class Rate extends AppCompatActivity {
private static Button button_ak;
private static TextView textView_ak;
private static RatingBar RatingBar_ak;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate);
        listenerForRatingbar();
        OnButtonClickListener();
    }

    public void listenerForRatingbar(){
        textView_ak = (TextView) findViewById(R.id.textView);
        RatingBar_ak  = (RatingBar)findViewById(R.id.ratingBar);
        RatingBar_ak.setOnRatingBarChangeListener(

                new RatingBar.OnRatingBarChangeListener() {
                    @Override
                    public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                        textView_ak.setText(String.valueOf(v));

                    }
                }
        );

    }
    public void OnButtonClickListener(){
        RatingBar_ak  = (RatingBar)findViewById(R.id.ratingBar);
        button_ak = (Button) findViewById(R.id.button);
        button_ak.setOnClickListener(

                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(Rate.this,
                                String.valueOf(RatingBar_ak.getRating()),
                        Toast.LENGTH_SHORT).show();                    }
                }
        );
    }
}
