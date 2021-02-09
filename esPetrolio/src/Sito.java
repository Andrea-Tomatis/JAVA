import java.awt.*;
import java.util.Vector;

public class Sito {
    String nome;
    String nazione;
    Vector<Pozzo> vettPozzi;

    public Sito(String nome, String nazione) {
        this.nome = nome;
        this.nazione = nazione;
        vettPozzi = new Vector<Pozzo>(10);
    }

    public void addPozzo(Pozzo p){
        vettPozzi.add(p);
    }

    public String getNome() {
        return nome;
    }

    public String getNazione() {
        return nazione;
    }

    public void setAttivo(boolean attivo, int codice) {
        if(codice < vettPozzi.size())
            vettPozzi.get(codice).setAttivo(attivo);
    }

    public float getGreccioTot(){
        float somma = 0;
        for (Pozzo p : vettPozzi){
            if (p.isAttivo())
                somma += p.getCapacita();
        }
        return somma;
    }

    public float getCapacitaTot(){
        float somma = 0;
        for (Pozzo p : vettPozzi){
            somma += p.getCapacita();
        }
        return somma;
    }

    public void getMediaGreggioPerTipo(){
        float sommaT = 0, sommaM = 0;
        float kT = 0, kM = 0;
        float mediaM, mediaT;
        for(Pozzo p : vettPozzi){
            if(p.isAttivo()){
                if(p instanceof Marino){
                    sommaM += p.getCapacita();
                    kM++;
                }else {
                    sommaT += p.getCapacita();
                    kT++;
                }
            }
        }

        if(kM == 0)
            mediaM = 0;
        if(kT == 0)
            mediaT = 0;

        mediaM = sommaM/kM;
        mediaT = sommaT/kT;
        System.out.println("media pozzi marini = " + mediaM + ", media pozzi terrestri = " + mediaT);
    }

    @Override
    public String toString() {
        String str = "nome sito = " + nome +", nazione = " + nazione + "\n";
        for(Pozzo p : vettPozzi){
            str += p.toString() + "\n";
        }
        return str;
    }
}
