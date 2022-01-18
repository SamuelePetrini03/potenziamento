package com.example.musica;

import java.util.ArrayList;

public class GestoreBrano {
    ArrayList<Brano> listaBrani;
    public GestoreBrano(){
        listaBrani = new ArrayList<Brano>();
    }

    public void addBrano(Brano b){
        listaBrani.add(b);
    }
}
