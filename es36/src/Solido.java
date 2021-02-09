public abstract class Solido {
    private double pesoSpecifico;

    public Solido(double pesoSpecifico){
        if(pesoSpecifico > 0)
            this.pesoSpecifico = pesoSpecifico;
        else this.pesoSpecifico = 10;
    }

    public double getPesoSpecifico() {
        return pesoSpecifico;
    }

    public abstract double getSuperficie();
    public abstract double getVolume();

    public double getPeso(){
        return pesoSpecifico * getVolume();
    }

    public String toString(){
        return "pesoSpecifico: " + pesoSpecifico + ", superficie: " + getPesoSpecifico() + ", volume: " + getVolume()
                + ", peso: " + getPeso();
    }
}
