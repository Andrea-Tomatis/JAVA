public class Videoteca {
    private String nome;
    private String indirizzo;
    private Cassetta[] magazzino;
    private final int MAX_CASSETTE = 10000;
    private int ncassette;


    public Videoteca(String indirizzo, String nome){
        this.nome = nome;
        this.indirizzo = indirizzo;
        ncassette = 0;
        magazzino = new Cassetta[MAX_CASSETTE];
    }

    public void add(Cassetta c){
        if(ncassette < MAX_CASSETTE)
            magazzino[ncassette++] = c;
    }

    public String getNome() {
        return nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void vendo(int codice){
        boolean ok = false;
        int i = 0;
        while (!ok && i < ncassette){
            if(magazzino[i].getMioCodice() == codice){
                magazzino[i].setNcopie(magazzino[i].getNcopie()+1);
                ok = true;
            }
        }
    }

    public void compro(int codice){
        boolean ok = false;
        int i = 0;
        while (!ok && i < ncassette){
            if(magazzino[i].getMioCodice() == codice){
                magazzino[i].setNcopie(magazzino[i].getNcopie()-1);
                ok = true;
            }
        }
    }

    public double getValoreNegozio(){
        double valore = 0;
        for(int i = 0; i < ncassette; i++){
            if(magazzino[i] instanceof Dvd)
                valore += ((Dvd) magazzino[i]).getPrezzo() * magazzino[i].getNcopie();
            else
                valore += ((Cd) magazzino[i]).getPrezzo() * magazzino[i].getNcopie();
        }
        return valore;
    }

    public String toString(){
        String str = nome + indirizzo;
        for(int i = 0; i < ncassette; i++)
            if(magazzino[i] instanceof Cd)
                str += ((Cd) magazzino[i]).toString();
            else str += ((Cassetta) magazzino[i]).toString();
        return str;
    }
}
