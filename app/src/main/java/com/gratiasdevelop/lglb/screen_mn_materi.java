package com.gratiasdevelop.lglb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class screen_mn_materi extends AppCompatActivity {
    TextView txtV_BTN_home, txtV_BTN_pgntr_siskor_mnsia, txtV_BTN_materi1_sistem_saraf, txtV_BTN_materi2_sistem_indra, txtV_BTN_materi3_sistem_endoktrin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar.
        setContentView(R.layout.activity_screen_mn_materi);

        txtV_BTN_home = findViewById(R.id.txtV_BTN_home);
        txtV_BTN_pgntr_siskor_mnsia= findViewById(R.id.txtV_BTN_pgntr_siskor_mnsia);
        txtV_BTN_materi1_sistem_saraf= findViewById(R.id.txtV_BTN_materi1_sistem_saraf);
        txtV_BTN_materi2_sistem_indra = findViewById(R.id.txtV_BTN_materi2_sistem_indra);
        txtV_BTN_materi3_sistem_endoktrin= findViewById(R.id.txtV_BTN_materi3_sistem_endoktrin);

        txtV_BTN_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        txtV_BTN_pgntr_siskor_mnsia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent screenMenuMateriPengantarSiskorMnsia = new Intent(screen_mn_materi.this,screen_materi_pengantar_siskormnsia.class);
                startActivity(screenMenuMateriPengantarSiskorMnsia);
            }
        });

        txtV_BTN_materi1_sistem_saraf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent screenMenuMateri1_sistemSaraf = new Intent(screen_mn_materi.this,screen_materi1_sistem_saraf.class);
                startActivity(screenMenuMateri1_sistemSaraf);
            }
        });

        txtV_BTN_materi2_sistem_indra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent screenMenuMateri2_sistemIndra = new Intent(screen_mn_materi.this,screen_materi2_sistem_indra.class);
                startActivity(screenMenuMateri2_sistemIndra);
            }
        });

        txtV_BTN_materi3_sistem_endoktrin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent screenMenuMateri3_sistemEndoktrin = new Intent(screen_mn_materi.this,screen_materi3_sistem_endoktrin.class);
                startActivity(screenMenuMateri3_sistemEndoktrin);
            }
        });
    }
}