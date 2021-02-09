public class Lavoratore {
    private String nome;
    private int livello;
    private float stipendio;
    private final int LIVELLO_MIN = 1;
    private final int LIVELLO_MAX = 5;


    public Lavoratore(String nome, int livello){
        this.nome = nome;

        if(livello >= LIVELLO_MIN && livello <= LIVELLO_MAX)
            this.livello = livello;
        else this.livello = LIVELLO_MIN;

        this.stipendio = 0;
    }

    public int getLivello() {
        return livello;
    }

    public float getStipendio() {
        return stipendio;
    }

    public void setLivello(int livello) {
        if(livello >= LIVELLO_MIN && livello <= LIVELLO_MAX)
            this.livello = livello;
    }

    public void setStipendio(float stipendio) {
        if(stipendio > 0) this.stipendio = stipendio;
    }

    public String getNome() {
        return nome;
    }

    public String toString(){
        return "nome = " + nome + ", livello= " + livello + ", stipendio= " + stipendio;
    }


}
