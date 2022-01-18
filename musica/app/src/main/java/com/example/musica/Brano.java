package com.example.musica;

public class Brano {
    private String titolo;
    private String genere;
    private String autore;
    private String durata;

    public Brano(String titolo, String durata, String autore, String genere){
        this.titolo = titolo;
        this.durata = durata;
        this.autore = autore;
        this.genere = genere;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getDurata() {
        return durata;
    }

    public void setDurata(String durata) {
        this.durata = durata;
    }
}
