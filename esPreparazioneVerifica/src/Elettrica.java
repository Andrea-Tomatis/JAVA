public class Elettrica extends Auto{
    private final double COSTO_RICARICA = 50;
    private double kmConRicarica;

    public Elettrica(TipoColore colore, String targa, double kmPercorsi, double kmConRicarica) throws ValoreNonValidoException {
        super(colore, targa, kmPercorsi);
        if(kmConRicarica > 0) this.kmConRicarica = kmConRicarica;
        else throw new ValoreNonValidoException("km con una ricarica non valido");
    }

    public double getKmConRicarica() {
        return kmConRicarica;
    }

    public void setKmConRicarica(double kmConRicarica) {
        this.kmConRicarica = kmConRicarica;
    }

    @Override
    public double getCostoTotale() {
        return super.getKmPercorsi() / kmConRicarica * COSTO_RICARICA;
    }

    public String toString(){
        return "km con una ricarica: " + kmConRicarica + ", costo ricarica: " + COSTO_RICARICA + ", " + super.toString();
    }
}
