import java.awt.print.PrinterAbortException;
import java.util.Vector;

public class Azienda {

    private Vector<ParcoMacchine> vettFiliale;

    public Azienda(){
        vettFiliale = new Vector<ParcoMacchine>(10);
    }

    public double getCostoTotale(){
        double costoTot = 0;
        for (ParcoMacchine p : vettFiliale)
            costoTot += p.getCostoTotale();
        return costoTot;
    }

    public void add(ParcoMacchine parco){
        vettFiliale.add(parco);
    }

    public void datiAuto(String targa, String filiale) throws AutoNonPresenteException {
        boolean ok = true;
        for(ParcoMacchine p : vettFiliale){
            if (p.getFiliale().equals(filiale)){
                ok = false;
                p.datiAuto(targa);
            }
        }
        if(ok)
            throw new AutoNonPresenteException("l'auto cercata non si trova in nessuna filiale");
    }

    public String toString(){
        String str = "";
        for(ParcoMacchine p : vettFiliale)
            str += p.toString() + "\n";
        return str;
    }
}
