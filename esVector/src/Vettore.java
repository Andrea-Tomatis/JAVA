import javax.swing.*;
import java.util.Vector;

public class Vettore {

    private Vector<Float> vet;

    public Vettore(int n){
        vet = new Vector<Float>(n);
    }

    public int getDim(){
        return vet.size();
    }

    public float getSomma(){
        float somma = 0f;
        for(int i = 0; i < vet.size(); i++)
            somma += vet.get(i);
        return somma;
    }

    public Float getElemento(int i){
        if (i > 0 && i < vet.size())
            return vet.get(i);
        else
            throw new ArrayIndexOutOfBoundsException();
    }

    public void add(float f){
        vet.add(f);
    }

    public boolean equals(Vettore v){
        if(v.getDim() != vet.size())
            return false;
        int i = 0;
        boolean ok = true;
        while(i < vet.size() && ok){
            if (vet.get(i) != v.getElemento(i))
                ok = false;
        }
        return ok;
    }

    public String toString(){
        String str = "";
        for(Float x : vet)
            str += x + ", ";
        return str;
    }
}
