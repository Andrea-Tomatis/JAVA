import java.io.IOException;

public class FormatoDatiClienteScorrettoException extends IOException {
    public FormatoDatiClienteScorrettoException(String s){
        super(s);
    }

    public FormatoDatiClienteScorrettoException(){
        super("invalid input: dati non validi");
    }
}
