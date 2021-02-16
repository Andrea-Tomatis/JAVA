public abstract class Solido implements FiguraSolida, CorpoSolido{
    private double pesoSpecifico;

    public Solido(double pesoSpecifico){
        if(pesoSpecifico > 0) this.pesoSpecifico = pesoSpecifico;
        else this.pesoSpecifico = 100;
    }

    public double getPesoSpecifico() {
        return pesoSpecifico;
    }

    public abstract double getPeso();

    public abstract double getSuperficie();

    public abstract double getVolume();

    public String toString(){
        return "peso specifico= " + pesoSpecifico;
    }
}
