public class Sfera extends Solido{
    private double raggio;

    public Sfera(double pesoSpecifico, double raggio) {
        super(pesoSpecifico);
        if(raggio > 0)
            this.raggio = raggio;
        else this.raggio = 10;
    }

    public double getRaggio() {
        return raggio;
    }

    @Override
    public double getPeso() {
        return super.getPesoSpecifico() * getVolume();
    }

    @Override
    public double getSuperficie() {
        return Math.PI * Math.pow(raggio, 2);
    }

    @Override
    public double getVolume() {
        return Math.pow(raggio,3) * Math.PI * 4/3;
    }

    public String toString(){
        return super.toString() + ", raggio= " + raggio;
    }
}
