public class Test {
    public static void main(String[] args) throws ValoreNonValidoException {
        Compagnia c = new Compagnia("delle indie");

        Sito s1 = new Sito("s1","africa");
        Sito s2 = new Sito("s2", "europa");

        Terrestre p1 = null;
        Terrestre p2 = null;
        Marino p3 = null;
        Marino p4 = null;

        try{
            p1 = new Terrestre(true, 250, TipoTerreno.ROCCIOSO);
        }catch (ValoreNonValidoException e){
            System.out.println(e.getMessage());
        }

        try{
            p2 = new Terrestre(false, 500, TipoTerreno.SABBIOSO);
        }catch (ValoreNonValidoException e){
            System.out.println(e.getMessage());
        }

        try{
            p3 = new Marino(true,1000,10);
        }catch (ValoreNonValidoException e){
            System.out.println(e.getMessage());
        }

        try{
            p4 = new Marino(false,2000,20);
        }catch (ValoreNonValidoException e){
            System.out.println(e.getMessage());
        }

        s1.addPozzo(p1);
        s1.addPozzo(p3);

        s2.addPozzo(p2);
        s2.addPozzo(p4);

        c.add(s1);
        c.add(s2);

        c.setAttivo("s1", true, 1);

        System.out.println(c);
        System.out.println("capacita' complessiva: " + c.getCapacitaComplessiva());
    }
}
