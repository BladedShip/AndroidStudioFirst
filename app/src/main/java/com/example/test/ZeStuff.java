package com.example.test;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import com.example.test.R;

public class ZeStuff extends AppCompatActivity {
    TextView myData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lookatme);
        myData = findViewById(R.id.textView);
        myData.setText("Mate, " + getIntent().getStringExtra("UNAME") + " is a bad Username and your password " +
                getIntent().getStringExtra("PWORD")+" is not strong at all. I mean, my 2 year old cousin can guess it.");
        Log.e("USERNAME IS", getIntent().getStringExtra("UNAME"));
    }
}