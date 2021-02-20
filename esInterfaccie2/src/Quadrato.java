public class Quadrato implements Figura{
    public Quadrato(){}

    @Override
    public void draw() {
        System.out.println("Quadrato disegnato");
    }

    @Override
    public void erase() {
        System.out.println("Quadrato cancellato");
    }
}
