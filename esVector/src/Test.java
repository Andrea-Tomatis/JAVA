public class Test {
    public static void main(String[] args) {
        Vettore v = new Vettore(5);
        for(int i = 0; i < 5; i++)
            v.add((float)i);
        System.out.println(v);
        System.out.println(v.getSomma());
    }
}
