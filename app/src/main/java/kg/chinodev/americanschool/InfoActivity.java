package com.example.americanschool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class activity_main2 extends AppCompatActivity {
    ImageView imageView;
    TextView textView;
    TextView textVie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        findViewById(R.id.текст);
        findViewById(R.id.флаг);
        findViewById(R.id.инфо);
        int imageRes = getIntent().getIntExtra("image", 0);
        int titleRes = getIntent().getIntExtra("title", 0);
        int descrRes = getIntent().getIntExtra("descr", 0);



    }

}