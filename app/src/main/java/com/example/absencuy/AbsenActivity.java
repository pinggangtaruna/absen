package com.example.absencuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AbsenActivity extends AppCompatActivity {

    private Button tbhAbsen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tbhAbsen = findViewById(R.id.absen);
        tbhAbsen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                Intent pindah = new Intent(AbsenActivity.this,TambahActivity2.class);
                startActivity(pindah);
            }
        });
    }
}