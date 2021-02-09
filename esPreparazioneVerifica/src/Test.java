public class Test {
    public static void main(String[] args) {
        Azienda z1 = new Azienda();

        ParcoMacchine p1 = new ParcoMacchine("Rossi");
        ParcoMacchine p2 = new ParcoMacchine("Verdi");

        p1.add(new Diesel(TipoColore.GRIGIO,"saldfk23",54.0,15));
        p1.add(new Diesel(TipoColore.GRIGIO,"sassa",54.0,15));
        p1.add(new Elettrica(TipoColore.NERO, "1234", 64, 800));
        p1.add(new Elettrica(TipoColore.NERO, "sadfsadfas", 64, 800));
        Auto a1 = new Diesel(TipoColore.BIANCO, "sadfasf", 564,654);

        try{
            a1.setKmPercorsi(-1220);
        }catch (ValoreNonValidoException e){
            System.out.println(e.getMessage());
        }

        p2.add(new Diesel(TipoColore.NERO,"tomatis",54.0,15));
        p2.add(new Diesel(TipoColore.BIANCO,"andrea",54.0,15));
        p2.add(new Elettrica(TipoColore.NERO, "1234", 64, 800));
        p2.add(new Elettrica(TipoColore.NERO, "9876", 64, 800));


        z1.add(p1);
        z1.add(p2);


        System.out.println(z1);

    }
}
