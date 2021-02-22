package Aggregazione;

public class Test {
    public static void main(String[] args) {
        Album a = new Album("album 1");
        a.addSong(new Canzone("canzone", "gianni", 300));
        System.out.println(a);
    }
}
