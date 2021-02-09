public class Cubo extends Solido{
    private double lato;

    public Cubo(double pesoSpecifico, double lato){
        super(pesoSpecifico);
        if(lato > 0) this.lato = lato;
        else this.lato = 10;
    }

    public double getLato() {
        return lato;
    }

    @Override
    public double getSuperficie() {
        return Math.pow(lato,2) * 6;
    }

    @Override
    public double getVolume() {
        return Math.pow(lato,3);
    }
}
