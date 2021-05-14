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
public class screen_materi2_tts extends AppCompatActivity {
    TextView txtV_BTN_home, txtV_BTN_back;
    WebView wView_tts_materi2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar.
        setContentView(R.layout.activity_screen_materi2_tts);

        txtV_BTN_home = findViewById(R.id.txtV_BTN_home);
        txtV_BTN_back = findViewById(R.id.txtV_BTN_back);

        wView_tts_materi2 = findViewById(R.id.wView_tts_materi2);

        WebSettings webSettings = wView_tts_materi2.getSettings();
        webSettings.setJavaScriptEnabled(true);

        int pickRandom = (int) (Math.random()*3);
        String api_list = new String [] {"aHR0cHM6Ly9sZ2xiLWFwcC5wb3J0YWxzaW5hdS54eXovdHRzX2dhbWUvbWF0ZXJpMl90dHNBLw==","aHR0cHM6Ly9sZ2xiLWFwcC5wb3J0YWxzaW5hdS54eXovdHRzX2dhbWUvbWF0ZXJpMl90dHNCLw==","aHR0cHM6Ly9sZ2xiLWFwcC5wb3J0YWxzaW5hdS54eXovdHRzX2dhbWUvbWF0ZXJpMl90dHNDLw=="}[pickRandom];

        byte[] api64_materi2_address = Base64.getDecoder().decode(api_list);

        String materi2_addressHook = new String(api64_materi2_address);
        wView_tts_materi2.loadUrl(materi2_addressHook);

        ObjectAnimator anim = ObjectAnimator.ofInt(wView_tts_materi2, "scrollY", wView_tts_materi2.getScrollY(), 0);
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
                Intent screenMenuUtama = new Intent(screen_materi2_tts.this,screen_menu_utama.class);
                screenMenuUtama.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(screenMenuUtama);
            }
        });
    }
}