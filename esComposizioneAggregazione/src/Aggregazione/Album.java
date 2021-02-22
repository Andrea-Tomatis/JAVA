package Aggregazione;

import java.util.Vector;

public class Album {
    private String titolo;
    private Vector<Canzone> canzoni;


    public Album(String titolo) {
        this.titolo = titolo;
        canzoni = new Vector<Canzone>();
    }

    public void addSong(Canzone c){
        canzoni.add(c);
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
