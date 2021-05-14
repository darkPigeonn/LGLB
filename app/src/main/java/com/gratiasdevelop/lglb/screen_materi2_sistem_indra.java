package com.gratiasdevelop.lglb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class screen_materi2_sistem_indra extends AppCompatActivity {
    TextView txtV_BTN_home, txtV_BTN_back, txtV_BTN_isiMateri2_sistemIndra, txtV_BTN_videoMateri2_sistemIndra,txtV_BTN_referensiPendukungMateri2_sistemIndra,txtV_BTN_LatihanSoalMateri2_sistemIndra, txtV_BTN_tktkSilangMateri2_sistemIndra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar.
        setContentView(R.layout.activity_screen_materi2_sistem_indra);

        txtV_BTN_home = findViewById(R.id.txtV_BTN_home);
        txtV_BTN_back = findViewById(R.id.txtV_BTN_back);

        txtV_BTN_isiMateri2_sistemIndra = findViewById(R.id.txtV_BTN_isiMateri2_sistemIndra);
        txtV_BTN_videoMateri2_sistemIndra= findViewById(R.id.txtV_BTN_videoMateri2_sistemIndra);
        txtV_BTN_referensiPendukungMateri2_sistemIndra= findViewById(R.id.txtV_BTN_referensiPendukungMateri2_sistemIndra);
        txtV_BTN_LatihanSoalMateri2_sistemIndra = findViewById(R.id.txtV_BTN_LatihanSoalMateri2_sistemIndra);
        txtV_BTN_tktkSilangMateri2_sistemIndra = findViewById(R.id.txtV_BTN_tktkSilangMateri2_sistemIndra);

        txtV_BTN_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        txtV_BTN_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent screenMenuUtama = new Intent(screen_materi2_sistem_indra.this,screen_menu_utama.class);
                screenMenuUtama.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(screenMenuUtama);
            }
        });

        txtV_BTN_isiMateri2_sistemIndra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent screenIsiMateri2 = new Intent(screen_materi2_sistem_indra.this,screen_materi2_isi.class);
                startActivity(screenIsiMateri2);
            }
        });

        txtV_BTN_videoMateri2_sistemIndra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                ProgressDialog loadingPopUp = new ProgressDialog(screen_materi2_sistem_indra.this);
//                loadingPopUp.setMessage("Loading ... ");
//                loadingPopUp.show();

                Intent screenVideoMateri2 = new Intent(screen_materi2_sistem_indra.this,screen_materi2_video.class);
                startActivity(screenVideoMateri2);

//                loadingPopUp.dismiss();
            }
        });

        txtV_BTN_referensiPendukungMateri2_sistemIndra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent screenRefPendukungMateri2 = new Intent(screen_materi2_sistem_indra.this,screen_materi2_ref_pndkg.class);
                startActivity(screenRefPendukungMateri2);
            }
        });

        txtV_BTN_LatihanSoalMateri2_sistemIndra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent latSoalMateri2 = new Intent(screen_materi2_sistem_indra.this,screen_materi2_latihan_soal.class);
                startActivity(latSoalMateri2);
            }
        });

        txtV_BTN_tktkSilangMateri2_sistemIndra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ttsMateri2 = new Intent(screen_materi2_sistem_indra.this,screen_materi2_tts.class);
                startActivity(ttsMateri2);
            }
        });
    }
}