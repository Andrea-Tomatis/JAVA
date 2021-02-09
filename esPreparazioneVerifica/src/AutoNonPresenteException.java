import java.io.IOException;

public class AutoNonPresenteException extends IOException {

    public AutoNonPresenteException(String s){
        super(s);
    }

    public AutoNonPresenteException(){
        super("auto non presente");
    }
}
