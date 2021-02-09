import java.io.IOException;

public class FormatoTempoScorrettoException extends IOException {
    public FormatoTempoScorrettoException(String s){
        super(s);
    }

    public FormatoTempoScorrettoException(){
        super("errore: formato tempo non corretto");
    }
}
