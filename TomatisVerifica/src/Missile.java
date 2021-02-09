import java.util.Vector;

public class Missile {
    private String modello;
    private Vector<Componente> vettComponenti;

    public Missile(String modello) {
        this.modello = modello;
        vettComponenti = new Vector<Componente>(10);
    }

    public double getPesoTot(){
        double somma = 0;
        for (Componente c : vettComponenti)
            somma += c.getPeso();
        return somma;
    }

    public String getModello() {
        return modello;
    }

    public void addComponente(Componente c){
        vettComponenti.add(c);
    }

    public boolean isCapaceDiVolare(){
        boolean ok = true;

        if(getPesoTot() + getCapacitaTot() > getSpintaTot())
            ok = false;

        if(getCapacitaTot() > getConsumoOrarioTot())
            ok = false;

        return ok;
    }

    private double getCapacitaTot(){
        double somma = 0;
        for (Componente c : vettComponenti)
            if(c instanceof Serbatoio) somma += ((Serbatoio) c).getCapacita();
        return somma;
    }
    private double getConsumoOrarioTot(){
        double somma = 0;
        for (Componente c : vettComponenti)
            if(c instanceof Motore) somma += ((Motore) c).getConsumoOrario();
        return somma;
    }

    private double getSpintaTot(){
        double somma = 0;
        for (Componente c : vettComponenti)
            if(c instanceof Motore) somma += ((Motore) c).getSpinta();
        return somma;
    }

    @Override
    public String toString() {
        String str = "nome = " + modello + "\n";
        for(Componente c : vettComponenti)
            str += c.toString() + "\n";
        return str;
    }
}
