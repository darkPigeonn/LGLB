package com.gratiasdevelop.lglb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class screen_mn_ki_kd_ipk extends AppCompatActivity {
    TextView txtV_BTN_home;
    Button txtV_BTN_ki, txtV_BTN_kd, txtV_BTN_ipk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar.
        setContentView(R.layout.activity_screen_mn_ki_kd_ipk);

        txtV_BTN_home = findViewById(R.id.txtV_BTN_home);
        txtV_BTN_ki = findViewById(R.id.txtV_BTN_ki);
        txtV_BTN_kd = findViewById(R.id.txtV_BTN_kd);
        txtV_BTN_ipk= findViewById(R.id.txtV_BTN_ipk);

        txtV_BTN_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        txtV_BTN_ki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent screenDetailKopetensiInti = new Intent(screen_mn_ki_kd_ipk.this,screen_dtl_kopetensi_inti.class);
                startActivity(screenDetailKopetensiInti);
            }
        });

        txtV_BTN_kd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent screenDetailKopetensiDasar = new Intent(screen_mn_ki_kd_ipk.this,screen_dtl_kopetensi_dasar.class);
                startActivity(screenDetailKopetensiDasar);
            }
        });

        txtV_BTN_ipk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent screenDetailIndikatorPcapaiKompetensi = new Intent(screen_mn_ki_kd_ipk.this,screen_dtl_indktr_pencapaian_kptensi.class);
                startActivity(screenDetailIndikatorPcapaiKompetensi);
            }
        });
    }
}