public class Diesel extends Auto{

    private static final double PREZZO_LITRO = 10;
    private double litro_kilometro;

    public Diesel(TipoColore colore, String targa, double kmPercorsi, double litro_kilometro) throws ValoreNonValidoException{
        super(colore, targa, kmPercorsi);
        if(litro_kilometro > 0) this.litro_kilometro = litro_kilometro;
        else throw new ValoreNonValidoException("km per litro non validi");
    }

    public double getCostoTotale(){
        return super.getKmPercorsi() / litro_kilometro * PREZZO_LITRO;
    }

    @Override
    public String toString() {
        return "prezzo per litro: " + PREZZO_LITRO + ", km per litro: " + litro_kilometro + ", " + super.toString();
    }
}
