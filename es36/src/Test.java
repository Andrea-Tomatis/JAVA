import java.util.Vector;

public class Test {

    public static void main(String[] args) {
        Solido[] sl = new Solido[2];
        Vector<Solido> s2 = new Vector<Solido>(2);

        sl[0] = new Cubo(100,2);
        sl[1] = new Sfera(200, 10);

        s2.add(new Cubo(100,2));
        s2.add(new Sfera(200, 10));

        for(Solido s : s2)
            System.out.println(s);
    }
}
