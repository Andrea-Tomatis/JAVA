public class Serbatoio extends Componente{

    private double capacita;

    public Serbatoio(double peso, String descrizione, double capacita) throws ValoreNonValidoException {
        super(peso, descrizione);
        if(capacita > 0) this.capacita = capacita;
        else
            throw new ValoreNonValidoException("capacita' inserita non valida");
    }

    public double getCapacita() {
        return capacita;
    }

    public String toString(){
        return super.toString() + ", capacita' = " + capacita;
    }
}
