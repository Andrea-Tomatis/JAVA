public class Cd extends Cassetta{
    private static double prezzo;
    private int nbrani;


    public Cd(String titolo, int duratasec, int nbrani) {
        super(titolo, duratasec);
        if (nbrani > 0) this.nbrani = nbrani;
        else this.nbrani = 2;
    }

    public int getNbrani() {
        return nbrani;
    }

    public static double getPrezzo() {
        return prezzo;
    }

    public static void setPrezzo(double prezzo){
        if(prezzo > 0) Cd.prezzo= prezzo;
    }

    public String toString(){
        return super.toString() + nbrani + prezzo;
    }
}
