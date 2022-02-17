package com.example.gestfile;


import android.content.Context;

import android.util.Log;


import java.io.BufferedReader;

import java.io.FileNotFoundException;

import java.io.FileOutputStream;

import java.io.IOException;

import java.io.InputStreamReader;

public class GestoreFile {
    String nomeFile;
    public GestoreFile(String nomeFile) {
        this.nomeFile = nomeFile;
    }
    public String readFile(String nomeFile, Context c) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bfr = new BufferedReader(new InputStreamReader(c.openFileInput(nomeFile)));
            String testoDaRestituire = "";
            while ((testoDaRestituire = bfr.readLine())!= null){
                sb.append(testoDaRestituire + "\n");
            }
        } catch (FileNotFoundException e) {
            Log.e("gestore", "File inesistente");
        } catch (IOException e) {
            Log.e("gestore", "Errore nella lettura del file");
        }
        return sb.toString();
    }
    public String scriviFile(String nomeFile, Context c){
        String esito;
        FileOutputStream fileo;
        String testoDaScrivere = "Questo è il testo del file creato";
        try {
            fileo = c.openFileOutput(nomeFile, Context.MODE_PRIVATE);
            fileo.write(testoDaScrivere.getBytes());
            fileo.close();
            esito = "File scritto correttamente";
        } catch (FileNotFoundException e) {
            esito = "Attenzione non sono riuscito a creare il file";
        } catch (IOException e) {
            e.printStackTrace();
            esito = "Errore in fase di scrittura del file";
        }
        return esito;
    }
}

