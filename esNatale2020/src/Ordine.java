import javax.xml.crypto.Data;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ordine {
    private static final int MAX_ROBOT = 20;
    private GregorianCalendar data;
    private Robot[] robot_ordinati;
    private int nrobot = 0;
    private Cliente eseguito;

    public Ordine(GregorianCalendar data, Cliente eseguito) {
        this.data = data;
        this.eseguito = eseguito;
        robot_ordinati = new Robot[MAX_ROBOT];
    }

    public GregorianCalendar getData() {
        return data;
    }

    public Robot[] getRobot_ordinati() {
        return robot_ordinati;
    }

    public int getNrobot() {
        return nrobot;
    }

    public Cliente getEseguito() {
        return eseguito;
    }

    public void addRobot(Robot r){
        if(nrobot < MAX_ROBOT)
            robot_ordinati[nrobot++] = r;
    }

    public String toString(){
        String str = "cliente: " + this.eseguito + ", data: " + data + "\n";
        for (int i = 0; i < nrobot; i++){
            str += robot_ordinati[i].toString();
            /*
            if (robot_ordinati[i] instanceof TipoA)
                str += ((TipoA)robot_ordinati[i]).toString();
            else if(robot_ordinati[i] instanceof TipoB)
                str += ((TipoB)robot_ordinati[i]).toString();
            else if(robot_ordinati[i] instanceof TipoC)
                str += ((TipoC)robot_ordinati[i]).toString();
            else
                str += robot_ordinati[i].toString();
            */
            str += '\n';
        }
        return str;
    }
}
