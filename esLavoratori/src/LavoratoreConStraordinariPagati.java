public class LavoratoreConStraordinariPagati extends Lavoratore{

    private int orestraordinario;
    private static float retribuzioneOraria = 10.0f;

    public LavoratoreConStraordinariPagati(String nome, int livello, int orestraordinario){
        super(nome, livello);
        if(orestraordinario > 0) this.orestraordinario = orestraordinario;
    }

    public int getOrestraordinario() {
        return orestraordinario;
    }

    public void setOrestraordinario(int orestraordinario) {
        if(orestraordinario > 0) this.orestraordinario = orestraordinario;
    }

    public static void setRetribuzioneOraria(float retribuzioneOraria) {
        if(retribuzioneOraria > 0) LavoratoreConStraordinariPagati.retribuzioneOraria = retribuzioneOraria;
    }


    public float getStipendio() {
        return super.getStipendio() + orestraordinario*retribuzioneOraria;
    }
}
