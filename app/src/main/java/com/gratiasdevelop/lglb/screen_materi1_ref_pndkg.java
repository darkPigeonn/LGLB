package com.gratiasdevelop.lglb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class screen_materi1_ref_pndkg extends AppCompatActivity {
    TextView txtV_BTN_home, txtV_BTN_back;
    Button btn_mtriPdkng1, btn_mtriPdkng2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar.
        setContentView(R.layout.activity_screen_materi1_ref_pndkg);

        txtV_BTN_home = findViewById(R.id.txtV_BTN_home);
        txtV_BTN_back = findViewById(R.id.txtV_BTN_back);
        btn_mtriPdkng1 = findViewById(R.id.btn_mtriPdkng1);
        btn_mtriPdkng2 = findViewById(R.id.btn_mtriPdkng2);

        txtV_BTN_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        txtV_BTN_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent screenMenuUtama = new Intent(screen_materi1_ref_pndkg.this,screen_menu_utama.class);
                screenMenuUtama.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(screenMenuUtama);
            }
        });

        btn_mtriPdkng1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri web_url = Uri.parse("https://www.researchgate.net/publication/320168912_REVIEW_PENYEBAB_GANGGUAN_AUTIS_MELALUI_JALUR_NEUROINFLAMASI");
                Intent WEB_referensiPendukung1_Materi1 = new Intent(Intent.ACTION_VIEW, web_url);
                startActivity(WEB_referensiPendukung1_Materi1);
            }
        });

        btn_mtriPdkng2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri web_url = Uri.parse("https://jurnal.ugm.ac.id/buletinpsikologi/article/download/25163/pdf");
                Intent WEB_referensiPendukung1_Materi2 = new Intent(Intent.ACTION_VIEW, web_url);
                startActivity(WEB_referensiPendukung1_Materi2);
            }
        });
    }
}