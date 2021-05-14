package com.gratiasdevelop.lglb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class screen_petunjuk_penggunaan extends AppCompatActivity {
    TextView txtV_BTN_home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar.

        setContentView(R.layout.activity_screen_petunjuk_penggunaan);

        txtV_BTN_home = findViewById(R.id.txtV_BTN_home);

        txtV_BTN_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}