package com.gratiasdevelop.lglb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class screen_menu_utama extends AppCompatActivity {
    TextView txtV_BTN_petunjukPenggunaan, txtV_BTN_materi, txtV_BTN_kdIPK, txtV_BTN_kataPengantar, txtV_BTN_petaKonsep, txtV_BTN_profilPeneliti, txtV_BTN_daftar_pustaka, txtV_BTN_evaluasi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar.

        setContentView(R.layout.activity_screen_menu_utama);

        txtV_BTN_petunjukPenggunaan = findViewById(R.id.txtV_BTN_petunjukPenggunaan);
        txtV_BTN_kataPengantar = findViewById(R.id.txtV_BTN_kataPengantar);
        txtV_BTN_petaKonsep= findViewById(R.id.txtV_BTN_petaKonsep);
        txtV_BTN_profilPeneliti= findViewById(R.id.txtV_BTN_profilPeneliti);
        txtV_BTN_daftar_pustaka = findViewById(R.id.txtV_BTN_daftar_pustaka);
        txtV_BTN_kdIPK = findViewById(R.id.txtV_BTN_kdIPK);
        txtV_BTN_materi = findViewById(R.id.txtV_BTN_materi);
        txtV_BTN_evaluasi= findViewById(R.id.txtV_BTN_evaluasi);

        txtV_BTN_profilPeneliti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent screenProfilPeneliti = new Intent(screen_menu_utama.this,screen_profil_peneliti.class);
                startActivity(screenProfilPeneliti);
            }
        });

        txtV_BTN_materi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent screenMenuMateri = new Intent(screen_menu_utama.this,screen_mn_materi.class);
                startActivity(screenMenuMateri);
            }
        });

        txtV_BTN_kdIPK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent screenKiKdIpk = new Intent(screen_menu_utama.this,screen_mn_ki_kd_ipk.class);
                startActivity(screenKiKdIpk);
            }
        });

        txtV_BTN_daftar_pustaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent screenDaftarPustaka = new Intent(screen_menu_utama.this,screen_daftar_pustaka.class);
                startActivity(screenDaftarPustaka);
            }
        });

        txtV_BTN_petunjukPenggunaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent screenPetunjkPenggunaan = new Intent(screen_menu_utama.this,screen_petunjuk_penggunaan.class);
                startActivity(screenPetunjkPenggunaan);
            }
        });

        txtV_BTN_petaKonsep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent screenPetaKonsep = new Intent(screen_menu_utama.this,screen_peta_konsep.class);
                startActivity(screenPetaKonsep);
            }
        });

        txtV_BTN_kataPengantar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent screenKataPengantar = new Intent(screen_menu_utama.this,screen_kata_pengantar.class);
                startActivity(screenKataPengantar);
            }
        });

        txtV_BTN_evaluasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent screenSoalEvaluasi = new Intent(screen_menu_utama.this,screen_soal_evaluasi.class);
                startActivity(screenSoalEvaluasi);
            }
        });
    }
}