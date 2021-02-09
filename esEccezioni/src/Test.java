public class Test {
    public static void main(String[] args) {
        Tempo t = new Tempo();
        try {
            t.setOre(70);
        } catch (FormatoTempoScorrettoException e) {
            System.out.println(e.getMessage());
        }
        try {
            t.setMinuti(34);
        } catch (FormatoTempoScorrettoException e) {
            System.out.println(e.getMessage());
        }
    }
}
