public class Test {
    public static void main(String[] args) {
        Lavoratore l1 = new Lavoratore("gianni",3);
        LavoratoreConStraordinariPagati l2 = new LavoratoreConStraordinariPagati("mario",45,3);
        l1.setStipendio(100.0f);
        l2.setStipendio(100.0f);

        System.out.println(l1);
        System.out.println("stipendio lavoratore 2: " + l2.getStipendio());
    }
}
