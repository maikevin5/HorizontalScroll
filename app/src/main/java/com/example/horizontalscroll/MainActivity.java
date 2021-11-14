package com.example.horizontalscroll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView plot = (ImageView) findViewById(R.id.plot);
        ImageView plot1 = (ImageView) findViewById(R.id.plot1);

        int ImageResource = getResources().getIdentifier("@drawable/plot", null, this.getPackageName());
        plot.setImageResource(ImageResource);

        int ImageResource1 = getResources().getIdentifier("@drawable/plot1", null, this.getPackageName());
        plot1.setImageResource(ImageResource1);
    }
}