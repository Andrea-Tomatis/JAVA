package Composizione;

import Aggregazione.Canzone;

import java.util.Vector;

public class Album {
    private String titolo;
    private Vector<Canzone> canzoni;

    private class Canzone {
        private String titolo, autore;
        private int durata_sec;

        public Canzone(String titolo, String autore, int durata_sec) {
            this.titolo = titolo;
            this.autore = autore;
            this.durata_sec = durata_sec;
        }

        public String getTitolo() {
            return titolo;
        }

        public void setTitolo(String titolo) {
            this.titolo = titolo;
        }

        public String getAutore() {
            return autore;
        }

        public void setAutore(String autore) {
            this.autore = autore;
        }

        public int getDurata_sec() {
            return durata_sec;
        }

        public void setDurata_sec(int durata_sec) {
            this.durata_sec = durata_sec;
        }

        public String toString(){
            return "titolo=" + titolo + ", autore=" + autore + ", durata=" + durata_sec;
        }
    }

    public Album(String titolo) {
        this.titolo = titolo;
        canzoni = new Vector<Canzone>();
    }

    public void addSong(String titolo, String autore, int durata){
        canzoni.add(new Canzone(titolo, autore, durata));
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String toString(){
        String str = "titolo dell'album= " + titolo + "\n";
        for(Canzone c : canzoni)
            str += "\t" + c.toString() + "\n";
        return str;
    }




}
