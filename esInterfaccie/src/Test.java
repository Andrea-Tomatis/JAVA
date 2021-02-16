public class Test {
    public static void main(String[] args) {
        Sfera s1 = new Sfera(100, 10);
        Cubo c1 = new Cubo(3000, 1);

        System.out.println("superficie sfera: " + s1.getSuperficie());
        System.out.println("superficie cubo: " + c1.getSuperficie());
    }
}
