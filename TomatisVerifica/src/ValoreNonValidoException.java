import java.io.IOException;

public class ValoreNonValidoException extends IOException {
    public ValoreNonValidoException() {
        super("valore inserito non valido");
    }

    public ValoreNonValidoException(String message) {
        super(message);
    }
}
