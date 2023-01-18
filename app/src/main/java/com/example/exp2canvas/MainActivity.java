package com.example.exp2canvas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btnH,btnB,btnG,btnD;
MyCanvas  MyCan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyCan=(MyCanvas) findViewById(R.id.Mycan);
        btnH=(Button) findViewById(R.id.btnH);
        btnB=(Button) findViewById(R.id.btnB);
        btnG=(Button) findViewById(R.id.btnG);
        btnD=(Button) findViewById(R.id.btnD);


        btnH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyCan.check=true;
                MyCan.bas=false;
                MyCan.gauche=false;
                MyCan.droite=false;
                MyCan.haut=true;
                MyCan.invalidate();

            }
        });
        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyCan.check=true;
                MyCan.bas=true;
                MyCan.invalidate();
                MyCan.haut=false;
                MyCan.gauche=false;
                MyCan.droite=false;
            }
        });
        btnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyCan.check=true;
                MyCan.haut=false;
                MyCan.bas=false;
                MyCan.gauche=false;
                MyCan.droite=true;
                MyCan.invalidate();

            }
        });
        btnG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MyCan.check=true;
                MyCan.haut=false;
                MyCan.bas=false;
                MyCan.droite=false;
                MyCan.gauche=true;

                MyCan.invalidate();

            }
        });

    }
}