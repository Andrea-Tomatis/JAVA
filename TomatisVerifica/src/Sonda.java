public class Sonda extends Componente{

    private TipoSonda tipoligia;

    public Sonda(double peso, String descrizione, TipoSonda tipoligia) throws ValoreNonValidoException {
        super(peso, descrizione);
        this.tipoligia = tipoligia;
    }

    public TipoSonda getTipoligia() {
        return tipoligia;
    }

    public String toString(){
        return super.toString() + "tipologia=" + tipoligia;
    }
}
