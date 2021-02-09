public abstract class Componente {
    private double peso;
    private String descrizione;

    public Componente(double peso, String descrizione) throws ValoreNonValidoException{
        if(peso > 0) this.peso = peso;
        else
            throw new ValoreNonValidoException("il peso del componente non e' valido");

        this.descrizione = descrizione;
    }

    public double getPeso() {
        return peso;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public String toString(){
        return "descrizione = " + descrizione + ", peso"  +peso ;
    }
}
