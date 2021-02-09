import javax.sound.midi.MidiUnavailableException;
import java.util.MissingFormatArgumentException;
import java.util.Vector;

public class Flotta {
    private String nome;
    Vector<Missile> vettMissili;

    public Flotta(String nome) {
        this.nome = nome;
        vettMissili = new Vector<Missile>(10);
    }

    public void addMissile(Missile s){
        vettMissili.add(s);
    }

    public void getDatiMissile(String modello) throws MissileNonPresenteException {
        boolean ok = false;
        int k = 0;
        while(k < vettMissili.size() && !ok){
            if (modello.equals(vettMissili.get(k).getModello())){
                System.out.println(vettMissili.get(k).toString());
                if (vettMissili.get(k).isCapaceDiVolare())
                    System.out.println("e' anche capace di volare");
                else
                    System.out.println("non e' capace di volare");
                ok = true;
            }
            k++;
        }
        if(!ok)
            throw new MissileNonPresenteException();
    }

    public int getNumeroMissiliVolanti(){
        int somma = 0;
        for(Missile s : vettMissili){
            if(s.isCapaceDiVolare())
                somma++;
        }
        return somma;
    }

    public String getNome(){
        return nome;
    }

    public String toString(){
        String str = "nome = " + nome + "\n";
        for(Missile s : vettMissili)
            str += s.toString() + "\n";
        return str;
    }
}
