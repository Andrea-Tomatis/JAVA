public class Test {
    public static void main(String[] argv) {
        Zoo zoo = new Zoo("Mio", 3);
        zoo.add( new Scoiattolo("gianni"));
        zoo.add(new Cane("stella"));
        zoo.add(new Gatto("nerone"));
        zoo.presentatevi();
    }
}
