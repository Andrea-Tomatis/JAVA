public class Sfera extends Solido{

    private double raggio;

    public Sfera(double pesoSpecifico, double raggio) {
        super(pesoSpecifico);
        this.raggio = raggio;
    }

    @Override
    public double getSuperficie() {
        return 4 * Math.PI * Math.pow(raggio,2);
    }

    @Override
    public double getVolume() {
        return 4/3 * Math.PI * Math.pow(raggio,3);
    }
}
