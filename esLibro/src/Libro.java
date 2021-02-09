public class Libro {
    private int npagine;

    public Libro(int npagine){
        if(npagine > 0) this.npagine = npagine;
        else this.npagine = 100;
    }

    public void pageMessage(){
        System.out.println("numero di pagine: " +  npagine);
    }

    public int getNpagine(){
        return npagine;
    }
}
