import java.util.Arrays;
import java.util.Objects;
import java.util.Vector;

public class SchoolRobot {
//    private Cliente[] clienti;
    private Vector<Cliente> clienti;
//    private int nclienti;

    public SchoolRobot(){
        clienti = new Vector<Cliente>();
    }

    public void addCliente(Cliente c){
        clienti.add(c);
    }

    public void removeCliente(Cliente c){
        for(int i = 0; i < clienti.size(); i++){
            if (clienti.get(i).equals(c))
                clienti.remove(i);
        }
        return;
    }

    @Override
    public String toString() {
        String str = "SchoolRobot: ";
        for(Cliente cliente : clienti)
            str += cliente;
        return str;
    }
}
