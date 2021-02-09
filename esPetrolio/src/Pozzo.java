public abstract class Pozzo {
    private static int cntCodici = 0;
    private int codice;
    private boolean attivo;
    private float capacita;

    public Pozzo(boolean attivo, float capacita) throws ValoreNonValidoException{
        if (capacita >= 0)
            this.capacita = capacita;
        else
            throw new ValoreNonValidoException("la capacita' non e' valida");

        this.attivo = attivo;
        this.codice = cntCodici;
        cntCodici++;
    }

    public float getCapacita() {
        return capacita;
    }

    public void setCapacita(float capacita) throws ValoreNonValidoException{
        if (capacita >= 0)
            this.capacita = capacita;
        else
            throw new ValoreNonValidoException("la capacita' non e' valida");
    }

    public int getCodice() {
        return codice;
    }

    public boolean isAttivo() {
        return attivo;
    }

    public void setAttivo(boolean attivo) {
        this.attivo = attivo;
    }

    @Override
    public String toString() {
        return "Pozzo: " +
                "codice=" + codice +
                ", attivo=" + attivo +
                ", capacita=" + capacita;
    }
}
