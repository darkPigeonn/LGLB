package com.gratiasdevelop.lglb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class screen_materi1_video extends AppCompatActivity {
    TextView txtV_BTN_home, txtV_BTN_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar.
        setContentView(R.layout.activity_screen_materi1_video);

        txtV_BTN_home = findViewById(R.id.txtV_BTN_home);
        txtV_BTN_back = findViewById(R.id.txtV_BTN_back);

        txtV_BTN_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        txtV_BTN_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent screenMenuUtama = new Intent(screen_materi1_video.this,screen_menu_utama.class);
                screenMenuUtama.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(screenMenuUtama);
            }
        });
    }
}