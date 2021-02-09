public class MissileNonPresenteException extends RuntimeException{
    public MissileNonPresenteException() {
        super("missile non presente in elenco");
    }

    public MissileNonPresenteException(String message) {
        super(message);
    }
}
