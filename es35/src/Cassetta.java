public class Cassetta {
    private static int codice;
    private int miocodice;
    private String titolo;
    private int duratasec;
    private double sconto;
    private int ncopie;

    public Cassetta(String titolo, int duratasec){
        this.titolo = titolo;
        if(duratasec > 0) this.duratasec = duratasec;
        else this.duratasec = 10;
        sconto = 0;
        ncopie = 0;
        miocodice = ncopie + 1;
    }

    public int getMioCodice() {
        return miocodice;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getDuratasec() {
        return duratasec;
    }

    public double getSconto() {
        return sconto;
    }

    public int getNcopie() {
        return ncopie;
    }

    public void setSconto(double sconto){
        if(sconto > 0) this.sconto = sconto;
    }

    public void setNcopie(int ncopie) {
        this.ncopie = ncopie;
    }

    @Override
    public String toString() {
        return "Cassetta: " +
                "miocodice=" + miocodice +
                ", titolo='" + titolo + '\'' +
                ", duratasec=" + duratasec +
                ", sconto=" + sconto +
                ", ncopie=" + ncopie;
    }
}
