public class Motore extends Componente{

    private double spinta;
    private double consumoOrario;

    public Motore(double peso, String descrizione, double spinta, double consumoOrario) throws ValoreNonValidoException{
        super(peso, descrizione);

        if (spinta > 0) this.spinta = spinta;
        else
            throw new ValoreNonValidoException("la spinta inserita non e' valida");

        if(consumoOrario > 0) this.consumoOrario = consumoOrario;
        else
            throw new ValoreNonValidoException("consumo orario non valido");
    }

    public double getSpinta() {
        return spinta;
    }

    public double getConsumoOrario() {
        return consumoOrario;
    }

    public String toString(){
        return super.toString() + ", spinta=" + spinta + ", consumo orario= " + consumoOrario;
    }
}
