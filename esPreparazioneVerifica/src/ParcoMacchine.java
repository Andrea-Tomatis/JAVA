import java.beans.VetoableChangeListener;
import java.util.Vector;

public class ParcoMacchine {

    private String filiale;
    private Vector<Auto> vettAuto;

    public ParcoMacchine(String filiale) {
        this.filiale = filiale;
        vettAuto = new Vector<Auto>(100);
    }

    public void add(Auto auto){
        vettAuto.add(auto);
    }

    public double getCostoTotale(){
        double costoTot = 0;
        for(Auto a : vettAuto){
            costoTot += a.getCostoTotale();
        }
        return costoTot;
    }

    public String getFiliale(){
        return filiale;
    }

    public boolean isPiuCostosoDiesel(){
        double costoTotDiesel = 0;
        for(Auto a : vettAuto){
            if (a instanceof Diesel)
                costoTotDiesel += a.getCostoTotale();
        }
        double costoTotElettrica = 0;
        for(Auto a : vettAuto){
            if (a instanceof Elettrica)
                costoTotElettrica += a.getCostoTotale();
        }

        return costoTotDiesel > costoTotElettrica;
    }

    public void datiAuto(String targa) throws AutoNonPresenteException{
        boolean ok = false;
        for(Auto a : vettAuto){
            if (a.getTarga().equals(targa)){
                ok = true;
                System.out.println(a.toString());
            }
        }
        if(!ok)
            throw new AutoNonPresenteException();
    }

    public String toString(){
        String str = "";
        for(Auto a : vettAuto){
            str += a.toString() + "\n";
        }
        return str;
    }
}
