public class TipoB extends Robot{
    private int puntiPerSec;
    public TipoB(String micro_processore, int dim_ram, int puntiPerSec) throws ComponenteNonValidaException{
        super(micro_processore,dim_ram);

        if(puntiPerSec > 0) this.puntiPerSec = puntiPerSec;
        else{
            throw new ComponenteNonValidaException("numero di punti scorretto");
        }
    }

    public int getPuntiPerSec() {
        return puntiPerSec;
    }

    public void setPuntiPerSec(int puntiPerSec) throws ComponenteNonValidaException{

        if(puntiPerSec > 0) this.puntiPerSec = puntiPerSec;
        else
            throw new ComponenteNonValidaException("numero di punti scorretto");
    }

    public String toString(){
        return "Tipo B: " + "punti al secondo=" + puntiPerSec + " " + super.toString();
    }
}
