package com.gratiasdevelop.lglb;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;

import java.util.Base64;
@RequiresApi(api = Build.VERSION_CODES.O)
public class screen_soal_evaluasi extends AppCompatActivity {
    WebView wView_latihan_soal_evaluasi;
    TextView txtV_BTN_home, txtV_BTN_back;
    byte[] api64_soalEvaluasi_address = Base64.getDecoder().decode("aHR0cHM6Ly9sZ2xiLWFwcC5wb3J0YWxzaW5hdS54eXovc29hbF9ldmFsdWFzaS8=");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar.
        setContentView(R.layout.activity_screen_soal_evaluasi);

        txtV_BTN_home = findViewById(R.id.txtV_BTN_home);
        txtV_BTN_back = findViewById(R.id.txtV_BTN_back);
        wView_latihan_soal_evaluasi = findViewById(R.id.wView_latihan_soal_evaluasi);

        WebSettings webSettings = wView_latihan_soal_evaluasi.getSettings();
        webSettings.setJavaScriptEnabled(true);
        String evaluasiSoal_addressHook = new String(api64_soalEvaluasi_address);
        wView_latihan_soal_evaluasi.loadUrl(evaluasiSoal_addressHook);

        ObjectAnimator anim = ObjectAnimator.ofInt(wView_latihan_soal_evaluasi, "scrollY", wView_latihan_soal_evaluasi.getScrollY(), 0);
        anim.setDuration(500).start();

        txtV_BTN_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        txtV_BTN_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent screenMenuUtama = new Intent(screen_soal_evaluasi.this,screen_menu_utama.class);
                screenMenuUtama.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(screenMenuUtama);
            }
        });
    }
}