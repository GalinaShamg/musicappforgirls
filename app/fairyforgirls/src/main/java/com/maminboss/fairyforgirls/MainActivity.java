package com.maminboss.fairyforgirls;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        overridePendingTransition(R.anim.rotate_in, R.anim.rotate_out);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton bel = (ImageButton) findViewById(R.id.belianochka);
        ImageButton dikielebedi = (ImageButton) findViewById(R.id.dikielebedi);
        ImageButton duimovochka = (ImageButton) findViewById(R.id.duimovochka) ;

         ImageButton bremenskie = (ImageButton) findViewById(R.id.bremenskie);

        bel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity1.class);
                startActivity(intent);
            }
        });

        dikielebedi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                startActivity(intent);
            }
        });

        duimovochka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity3.class);
                startActivity(intent);
            }
        });

        bremenskie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity10.class);
                startActivity(intent);
            }
        });




    }
}