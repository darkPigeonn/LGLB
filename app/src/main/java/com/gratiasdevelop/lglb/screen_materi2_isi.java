package com.gratiasdevelop.lglb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import com.github.barteksc.pdfviewer.PDFView;

public class screen_materi2_isi extends AppCompatActivity {
    PDFView pdfIsiMateri2;
    TextView txtV_BTN_home, txtV_BTN_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar.
        setContentView(R.layout.activity_screen_materi2_isi);

        pdfIsiMateri2 = findViewById(R.id.pdfIsiMateri2);
        txtV_BTN_home = findViewById(R.id.txtV_BTN_home);
        txtV_BTN_back = findViewById(R.id.txtV_BTN_back);

        pdfIsiMateri2.fromAsset("materi2.pdf").swipeHorizontal(true).pageSnap(true).autoSpacing(true).pageFling(true).load();

        txtV_BTN_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        txtV_BTN_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent screenMenuUtama = new Intent(screen_materi2_isi.this,screen_menu_utama.class);
                screenMenuUtama.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(screenMenuUtama);
            }
        });
    }
}