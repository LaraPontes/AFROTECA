package br.edu.ifce.afroteca;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
        setTitleColor(Color.parseColor("#FF473A"));

        final EditText campoPesquisa = findViewById(R.id.botao_pesquisa);

        Button BotaoPesquisa = findViewById(R.id.botao_pesquisa);
        BotaoPesquisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pesquisa = campoPesquisa.getText().toString();
            }
        });

    }
}
