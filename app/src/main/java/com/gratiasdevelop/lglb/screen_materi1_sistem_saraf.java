package com.gratiasdevelop.lglb;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class screen_materi1_sistem_saraf extends AppCompatActivity {
    TextView txtV_BTN_home, txtV_BTN_back, txtV_BTN_isiMateri1_sistemSaraf, txtV_BTN_videoMateri1_sistemSaraf, txtV_BTN_referensiPendukungMateri1_sistemSaraf, txtV_BTN_LatihanSoalMateri1_sistemSaraf, txtV_BTN_tktkSilangMateri1_sistemSaraf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar.
        setContentView(R.layout.activity_screen_materi1_sistem_saraf);

        txtV_BTN_isiMateri1_sistemSaraf = findViewById(R.id.txtV_BTN_isiMateri1_sistemSaraf);
        txtV_BTN_videoMateri1_sistemSaraf = findViewById(R.id.txtV_BTN_videoMateri1_sistemSaraf);
        txtV_BTN_referensiPendukungMateri1_sistemSaraf = findViewById(R.id.txtV_BTN_referensiPendukungMateri1_sistemSaraf);
        txtV_BTN_LatihanSoalMateri1_sistemSaraf = findViewById(R.id.txtV_BTN_LatihanSoalMateri1_sistemSaraf);
        txtV_BTN_tktkSilangMateri1_sistemSaraf = findViewById(R.id.txtV_BTN_tktkSilangMateri1_sistemSaraf);

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
                Intent screenMenuUtama = new Intent(screen_materi1_sistem_saraf.this,screen_menu_utama.class);
                screenMenuUtama.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(screenMenuUtama);
            }
        });

        txtV_BTN_isiMateri1_sistemSaraf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent screenIsiMateri1 = new Intent(screen_materi1_sistem_saraf.this,screen_materi1_isi.class);
                startActivity(screenIsiMateri1);
            }
        });

        txtV_BTN_videoMateri1_sistemSaraf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProgressDialog loadingPopUp = new ProgressDialog(screen_materi1_sistem_saraf.this);
                loadingPopUp.setMessage("Loading ... ");
                loadingPopUp.show();

                Intent screenVideoMateri1 = new Intent(screen_materi1_sistem_saraf.this,screen_materi1_video.class);
                startActivity(screenVideoMateri1);

                loadingPopUp.dismiss();
            }
        });

        txtV_BTN_referensiPendukungMateri1_sistemSaraf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent screenRefPendukungMateri1 = new Intent(screen_materi1_sistem_saraf.this,screen_materi1_ref_pndkg.class);
                startActivity(screenRefPendukungMateri1);
            }
        });

        txtV_BTN_LatihanSoalMateri1_sistemSaraf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent screenLatSoalMateri1 = new Intent(screen_materi1_sistem_saraf.this,screen_materi1_latihan_soal.class);
                startActivity(screenLatSoalMateri1);
            }
        });

        txtV_BTN_tktkSilangMateri1_sistemSaraf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent screenTTSMateri1 = new Intent(screen_materi1_sistem_saraf.this,screen_materi1_tts.class);
                startActivity(screenTTSMateri1);
            }
        });
    }
}