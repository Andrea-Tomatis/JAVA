public class RandomShapeGenerator {

    private int randomShape;
    private Figura f;

    public Figura next(){

        randomShape = (int)(Math.random() * 10) % 3 + 1;

        switch (randomShape){
            case 1:
                f = new Cerchio();
                break;
            case 2:
                f = new Triangolo();
                break;
            case 3:
                f = new Quadrato();
                break;
            default:
                f = null;
                break;
        }

        return f;
    }
}
