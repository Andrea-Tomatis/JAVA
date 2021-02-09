import java.io.IOException;

public class ComponenteNonValidaException extends IOException {
    public ComponenteNonValidaException(String s){
        super(s);
    }

    public ComponenteNonValidaException(){
        super("invalid input: componente non valido");
    }
}
