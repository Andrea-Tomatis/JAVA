public class TipoC extends Robot{
    private Materiali materiale;

    public TipoC(String micro_processore, int dim_ram, Materiali materiale) throws ComponenteNonValidaException{
        super(micro_processore, dim_ram);
        this.materiale = materiale;
    }

    public Materiali getMateriale() {
        return materiale;
    }

    public void setMateriale(Materiali materiale) {
        this.materiale = materiale;
    }

    public String toString(){
        return "Tipo C: " + "materiale=" +materiale + " " + super.toString();
    }
}
