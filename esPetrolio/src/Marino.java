public class Marino extends Pozzo{
    private float profondita;

    public Marino(boolean attivo, float capacita, float profondita) throws ValoreNonValidoException {
        super(attivo, capacita);
        if (profondita >= 0) this.profondita = profondita;
        else
            throw new ValoreNonValidoException("profondita' non valida");
    }

    public float getProfondita() {
        return profondita;
    }

    public String toString(){
        return super.toString() + ", profondita'=" + profondita;
    }
}
