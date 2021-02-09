public abstract class Auto {
    private TipoColore colore;
    private String targa;
    private double kmPercorsi;

    public Auto(TipoColore colore, String targa, double kmPercorsi) throws ValoreNonValidoException{
        this.colore = colore;
        this.targa = targa;
        if(kmPercorsi >= 0) this.kmPercorsi = kmPercorsi;
        else throw new ValoreNonValidoException("km percorsi non validi");
    }

    public double getKmPercorsi() {
        return kmPercorsi;
    }

    public void setKmPercorsi(double kmPercorsi) {
        if(kmPercorsi >= 0) this.kmPercorsi = kmPercorsi;
        else throw new ValoreNonValidoException("km percorsi non validi");
    }

    public TipoColore getColore() {
        return colore;
    }

    public String getTarga() {
        return targa;
    }

    public abstract double getCostoTotale();

    public String toString(){
        return "targa: " + targa + ", colore: " + colore + "km percorsi: " + kmPercorsi;
    }

}
