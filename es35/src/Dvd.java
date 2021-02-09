public class Dvd extends Cassetta{
    private static double prezzo;
    private TipoLingua[] lingua;

    private int nlingue;
    private static int MAX_LINGUE = 5;


    public Dvd(String titolo, int duratasec) {

        super(titolo, duratasec);
        lingua = new TipoLingua[MAX_LINGUE];
        nlingue = 0;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public static void setPrezzo(double prezzo){
        if(prezzo > 0) Dvd.prezzo= prezzo;
    }


    public void addLingua(TipoLingua lingua){
        if(nlingue < MAX_LINGUE)
            this.lingua[nlingue++] = lingua;
    }

    public String getLigua() {
        String str = "";
        for(int i =0; i < nlingue; i++)
            str += lingua[i];
        return str;
    }



    public String toString(){
        return super.toString() + prezzo + getLigua();
    }
}
