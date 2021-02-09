import java.io.IOException;

public class NumeroOrdiniEccessivoException extends IOException {
    public NumeroOrdiniEccessivoException(String s){
        super(s);
    }

    public NumeroOrdiniEccessivoException(){
        super("invalid input: numero ordini troppo grande");
    }
}
