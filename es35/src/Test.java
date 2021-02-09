public class Test {
    public static void main(String[] args) {
        Videoteca v = new Videoteca("videoteca1","via napoleone");
        Cd cd1 = new Cd("titolocd",45000,23);
        Dvd dvd1 = new Dvd("titolodvd",62000);

        cd1.setPrezzo(24);
        dvd1.setPrezzo(24);

        v.add(cd1);
        v.add(dvd1);
        System.out.println(v.getValoreNegozio());
        System.out.println(v);
    }
}
