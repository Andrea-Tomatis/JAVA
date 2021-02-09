public abstract class Robot {
    private String micro_processore;
    private int dim_ram;

    public Robot(String micro_processore, int dim_ram) throws ComponenteNonValidaException {
        this.micro_processore = micro_processore;
        this.setDim_ram(dim_ram);
    }

    public String getMicro_processore() {
        return micro_processore;
    }

    public void setDim_ram(int dim_ram) throws ComponenteNonValidaException {
        if(dim_ram > 0) this.dim_ram = dim_ram;
        else throw new ComponenteNonValidaException("invalid input: memoria ram inesistente");
    }

    public int getDim_ram() {
        return dim_ram;
    }

    public String toString(){
        return "processore="+micro_processore + ", ram =" + dim_ram;
    }
}
