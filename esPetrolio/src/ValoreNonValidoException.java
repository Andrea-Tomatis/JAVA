import java.io.IOException;

public class ValoreNonValidoException extends IOException {
    public ValoreNonValidoException() {
        super("valore non valido");
    }

    public ValoreNonValidoException(String message) {
        super(message);
    }
}
