public class Terrestre extends Pozzo{

    private TipoTerreno terreno;

    public Terrestre(boolean attivo, float capacita, TipoTerreno terreno) throws ValoreNonValidoException {
        super(attivo, capacita);
        this.terreno = terreno;
    }

    public TipoTerreno getTerreno() {
        return terreno;
    }

    public String toString(){
        return super.toString() + ", terreno=" + terreno;
    }
}
