public class Triangolo implements Figura{

    public Triangolo(){}

    @Override
    public void draw() {
        System.out.println("Triangolo disegnato");
    }

    @Override
    public void erase() {
        System.out.println("Triangolo cancellato");
    }
}
