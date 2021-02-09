import java.io.IOException;

public class FormatoDataScorrettoException extends IOException{

    public FormatoDataScorrettoException(String s){
        super(s);
    }

    public FormatoDataScorrettoException(){
            super("errore: formato data non corretto");
        }
}
