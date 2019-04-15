package br.edu.ifce.afroteca;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
          setContentView(R.layout.activity_main);
          setTitle("AFROTECA");
          setSupportActionBar((Toolbar) findViewById(R.id.my_toolbar));

        Button historia1 = (Button) findViewById(R.id.fig_1);
        Button historia2 = (Button) findViewById(R.id.fig_2);
        Button historia3 = (Button) findViewById(R.id.fig_3);
        Button historia4 = (Button) findViewById(R.id.fig_4);
        Button historia5 = (Button) findViewById(R.id.fig_5);
        Button historia6 = (Button) findViewById(R.id.fig_6);

        historia1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, Tela2.class);
                startActivity(it);
            }
        });

        historia2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, Tela3.class);
                startActivity(it);
            }
        });

        historia3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, Tela4.class);
                startActivity(it);
            }
        });

        historia4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, Tela5.class);
                startActivity(it);
            }
        });

        historia5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, Tela6.class);
                startActivity(it);
            }
        });

        historia6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, Tela7.class);
                startActivity(it);
            }
        });



    }
}
