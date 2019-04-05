package br.edu.ifce.afroteca;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("AFROTECA");
        setTitleColor(Color.parseColor("#FF473A"));



        /*
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00000000")));
        bar.setTextAlignment(R.id.TEXT_ALIGNMENT_CENTER);
*/



//        List<String> alunos = new ArrayList<String>();
//        alunos.add("Lara");
//        alunos.add("Juliana");
//        alunos.add("Adeliano");
//        alunos.add("Lucas");
//        alunos.add("Gustavo");

//        ListView lista_alunos = findViewById(R.id.activity_main_lista_de_alunos);
//        lista_alunos.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alunos));

        /*android.support.v7.widget.SearchView(findViewById(R.id.Pesquisa));*/

      /*  searchView = new SearchView(myActivity);
        searchView.setMaxWidth(Integer.MAX_VALUE);*/




    }
}
