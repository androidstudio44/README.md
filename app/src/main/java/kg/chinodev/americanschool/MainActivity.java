package com.example.americanschool;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout service_language;
    private ConstraintLayout service_camp;
    private ConstraintLayout service_talking;
    private ConstraintLayout service_toefl;
    private  TextView callBtn;
    private ConstraintLayout banner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        service_language = findViewById(R.id.service_language);
        service_camp = findViewById(R.id.service_camp);
        service_talking = findViewById(R.id.service_talking);
        service_toefl = findViewById(R.id.service_toefl);
        callBtn = findViewById(R.id.call_button);
        banner = findViewById(R.id.banner);

        callBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = "+996705353330";
                Uri myUri = Uri.parse("tel:" + number);
                Intent myIntent = new Intent(Intent.ACTION_DIAL, myUri);
                startActivity(myIntent);
            }
        });
        banner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String link = "http://google.com";
                Uri myUri = Uri.parse(link);
                Intent myIntent = new Intent(Intent.ACTION_VIEW, myUri);
                startActivity(myIntent);
            }
        });

        service_language.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startInfoActivity(
                        R.string.service_language,
                        R.drawable.image_1,
                        R.string.service_language_descr);
            }
        });
        service_camp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startInfoActivity(
                        R.string.service_camp,
                        R.drawable.image_2,
                        R.string.service_camp_descr);
            }
        });
        service_toefl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startInfoActivity(
                        R.string.service_toefl,
                        R.drawable.image_3,
                        R.string.service_toefl_descr);
            }
        });
        service_talking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startInfoActivity(
                        R.string.service_talking,
                        R.drawable.image_4,
                        R.string.service_toefl_descr);
            }
        });
    }

    private void startInfoActivity(int titleRes, int imageRes, int descrRes) {
        Intent myIntent = new Intent(this, activity_main2.class);
        myIntent.putExtra("title", titleRes);
        myIntent.putExtra("image", imageRes);
        myIntent.putExtra("descr", descrRes);
        startActivity(myIntent);


    }
}
