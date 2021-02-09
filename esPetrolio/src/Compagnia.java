import java.util.Vector;

public class Compagnia {
    String nome;
    Vector<Sito> vettSiti;

    public Compagnia(String nome) {
        this.nome = nome;
        vettSiti = new Vector<Sito>(10);
    }

    public void add(Sito s){
        vettSiti.add(s);
    }

    public float getCapacitaComplessiva(){
        float somma = 0;
        for (Sito s : vettSiti){
            somma += s.getCapacitaTot();
        }
        return somma;
    }

    public void setAttivo(String nome, boolean attivo, int codice){
        boolean ok =false;
        int k = 0;

        while(!ok && k < vettSiti.size()){
            if(nome.equals(vettSiti.get(k).getNome())){
                vettSiti.get(k).setAttivo(attivo,codice);
                ok = true;
                System.out.println("stato pozzo cambiato con successo");
            }
            k++;
        }
    }

    public String toString(){
        String str = "nome Compagnia = " + nome + "\n";
        for (Sito s : vettSiti){
            str += s.toString() + "\n";
        }

        return str;
    }
}
