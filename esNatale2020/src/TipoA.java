public class TipoA extends Robot{

    private float spessore_taglio;
    private float precisione_taglio;

    public TipoA(String micro_processore, int dim_ram, float precisione_taglio, float spessore_taglio) throws ComponenteNonValidaException{
        super(micro_processore,dim_ram);

        if(spessore_taglio > 0) this.spessore_taglio = spessore_taglio;
        else this.spessore_taglio = 1;

        if(precisione_taglio > 0) this.precisione_taglio = precisione_taglio;
        else this.precisione_taglio = 1;
    }

    public float getSpessore_taglio() {
        return spessore_taglio;
    }

    public void setSpessore_taglio(float spessore_taglio) {
        if(spessore_taglio > 0) this.spessore_taglio = spessore_taglio;
    }

    public float getPrecisione_taglio() {
        return precisione_taglio;
    }

    public void setPrecisione_taglio(float precisione_taglio) {
        if(precisione_taglio > 0) this.precisione_taglio = precisione_taglio;
    }

    @Override
    public String toString() {
        return "TipoA: " +
                "spessore_taglio=" + spessore_taglio +
                ", precisione_taglio=" + precisione_taglio + " " +
                super.toString();
    }
}
