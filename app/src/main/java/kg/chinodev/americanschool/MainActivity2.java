package com.example.americanschool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class activity_main2 extends AppCompatActivity {
    ImageView imageView;
    TextView textView;
    TextView info;
    ImageView close;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        close = findViewById(R.id.close);

        textView = findViewById(R.id.text);
        imageView = findViewById(R.id.flag);
        info = findViewById(R.id.info);
        int imageRes = getIntent().getIntExtra("image", 0);
        imageView.setImageResource(imageRes);
        int titleRes = getIntent().getIntExtra("title", 0);
        textView.setText(titleRes);
        int descrRes = getIntent().getIntExtra("descr", 0);
        info.setText(descrRes);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });




    }

}
