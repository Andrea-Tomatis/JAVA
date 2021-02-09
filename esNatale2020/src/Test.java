import java.util.GregorianCalendar;

public class Test {
    public static void main(String[] args) throws ComponenteNonValidaException,FormatoDataScorrettoException, NumeroOrdiniEccessivoException, FormatoDatiClienteScorrettoException{
        SchoolRobot s = new SchoolRobot();
        InputTastiera input = new InputTastiera();
        TipoA r1 = new TipoA("intel",512,99, 89);
        Cliente c1 = new Cliente("mario","rossi");
        Ordine o1 = new Ordine(new GregorianCalendar(),c1);
        o1.addRobot(r1);
        s.addCliente(c1);
        System.out.println(s.toString() + "\n" +  o1.toString());
//        s.removeCliente(c1);
    }
}
