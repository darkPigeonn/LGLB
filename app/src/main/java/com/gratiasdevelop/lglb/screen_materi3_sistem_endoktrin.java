package com.gratiasdevelop.lglb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class screen_materi3_sistem_endoktrin extends AppCompatActivity {
    TextView txtV_BTN_home, txtV_BTN_back;
    TextView txtV_BTN_isiMateri3_sistemEndoktrin, txtV_BTN_videoMateri3_sistemEndoktrin, txtV_BTN_referensiPendukungMateri3_sistemEndoktrin, txtV_BTN_LatihanSoalMateri3_sistemEndoktrin, txtV_BTN_tktkSilangMateri3_sistemEndoktrin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar.
        setContentView(R.layout.activity_screen_materi3_sistem_endoktrin);

        txtV_BTN_home = findViewById(R.id.txtV_BTN_home);
        txtV_BTN_back = findViewById(R.id.txtV_BTN_back);

        txtV_BTN_isiMateri3_sistemEndoktrin = findViewById(R.id.txtV_BTN_isiMateri3_sistemEndoktrin);
        txtV_BTN_videoMateri3_sistemEndoktrin = findViewById(R.id.txtV_BTN_videoMateri3_sistemEndoktrin);
        txtV_BTN_referensiPendukungMateri3_sistemEndoktrin = findViewById(R.id.txtV_BTN_referensiPendukungMateri3_sistemEndoktrin);
        txtV_BTN_LatihanSoalMateri3_sistemEndoktrin = findViewById(R.id.txtV_BTN_LatihanSoalMateri3_sistemEndoktrin);
        txtV_BTN_tktkSilangMateri3_sistemEndoktrin = findViewById(R.id.txtV_BTN_tktkSilangMateri3_sistemEndoktrin);

        txtV_BTN_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        txtV_BTN_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent screenMenuUtama = new Intent(screen_materi3_sistem_endoktrin.this,screen_menu_utama.class);
                screenMenuUtama.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(screenMenuUtama);
            }
        });

        txtV_BTN_referensiPendukungMateri3_sistemEndoktrin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent screenRefPendukung_materi3 = new Intent(screen_materi3_sistem_endoktrin.this,screen_materi3_ref_pndkg.class);

                startActivity(screenRefPendukung_materi3);
            }
        });

        txtV_BTN_videoMateri3_sistemEndoktrin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent screenVideo_materi3 = new Intent(screen_materi3_sistem_endoktrin.this,screen_materi3_video.class);
                startActivity(screenVideo_materi3);
            }
        });

        txtV_BTN_isiMateri3_sistemEndoktrin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent screenIsi_materi3 = new Intent(screen_materi3_sistem_endoktrin.this,screen_materi3_isi.class);
                startActivity(screenIsi_materi3);
            }
        });

        txtV_BTN_LatihanSoalMateri3_sistemEndoktrin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent latSoal_materi3 = new Intent(screen_materi3_sistem_endoktrin.this,screen_materi3_latihan_soal.class);
                startActivity(latSoal_materi3);
            }
        });

        txtV_BTN_tktkSilangMateri3_sistemEndoktrin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tts_materi3 = new Intent(screen_materi3_sistem_endoktrin.this,screen_materi3_tts.class);
                startActivity(tts_materi3);
            }
        });
    }
}