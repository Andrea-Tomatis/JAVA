public class Vocabolario extends Libro{
    private int numDefinizioni;

    public Vocabolario(int npagine, int numDefinizioni) {
        super(npagine);
        if(numDefinizioni > 0) this.numDefinizioni = numDefinizioni;
        else this.numDefinizioni = 10;
    }

    public void definitionMessage(){
        super.pageMessage();
        System.out.println("il numero di definizioni e': " + numDefinizioni);
        System.out.println("il numero medio di definizioni per pagina e': " + (double)getNpagine()/(double)numDefinizioni);
    }
}
