package com.example.gestfile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnLeggi;
    Button btnScrivi;
    EditText txtContenuto;
    GestoreFile gf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLeggi= (Button)findViewById(R.id.btnLeggi);
        btnScrivi= (Button)findViewById(R.id.btnScrivi);
        txtContenuto= findViewById(R.id.txtContenuto);
        gf= new GestoreFile("nomeFile.txt");
        btnLeggi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sb=  gf.readFile("nomeFile.txt", getApplicationContext());
                Toast.makeText(getApplicationContext(), sb, Toast.LENGTH_LONG ).show();
            }
        });
        btnScrivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sc= gf.scriviFile("nomeFile.txt", getApplicationContext());
                Toast.makeText(getApplicationContext(), sc, Toast.LENGTH_LONG ).show();
            }
        });

    }
}
