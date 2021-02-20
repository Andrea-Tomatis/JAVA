public class Cerchio implements Figura{
    public Cerchio(){}

    @Override
    public void draw() {
        System.out.println("Cerchio disegnato");
    }

    @Override
    public void erase() {
        System.out.println("Cerchio cancellato");
    }
}
