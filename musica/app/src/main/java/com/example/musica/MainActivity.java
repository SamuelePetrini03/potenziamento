package com.example.musica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
Button btnInserisci;
EditText txtTitolo;
EditText txtDurata;
EditText txtAutore;
Spinner spGeneri;
GestoreBrano gb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] generi = {"Pop", "Rap", "Trap", "Dance"};
        ArrayAdapter<String> aaG = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, generi);
        spGeneri = (Spinner) findViewById(R.id.spGeneri);
        spGeneri.setAdapter(aaG);

        btnInserisci = (Button) findViewById(R.id.btnInserisci);
        txtTitolo = (EditText) findViewById(R.id.txtTitolo);
        txtDurata = (EditText) findViewById(R.id.txtDurata);
        txtAutore = (EditText) findViewById(R.id.txtAutore);

        gb = new GestoreBrano();

        btnInserisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Brano b = new Brano(txtTitolo.getText().toString(), txtDurata.getText().toString(),
                        txtAutore.getText().toString(), spGeneri.getSelectedItem().toString());
                gb.addBrano(b);
                Log.d("brano aggiunto", b.toString());
            }
        });
    }
}



