public class ValoreNonValidoException extends RuntimeException{

    public ValoreNonValidoException(String s){
        super(s);
    }

    public ValoreNonValidoException(){
        super("valore inserito non valido");
    }
}
