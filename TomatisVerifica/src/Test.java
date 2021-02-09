import javax.sound.midi.MidiUnavailableException;

public class Test {
    public static void main(String[] args) throws ValoreNonValidoException, MissileNonPresenteException {

        Flotta f1 = new Flotta("NASA");
        Flotta f2 = new Flotta("ESA");

        Missile m1 = new Missile("sputnik");
        Missile m2 = new Missile("apollo");

        //inizializzazione missile 2
        try {
            m1.addComponente(new Motore(1000,"motore potente",2000,50));
        }catch (ValoreNonValidoException e){
            System.out.println(e.getMessage());
        }

        try {
            m1.addComponente(new Serbatoio(2000,"serbatoio potente",600));
        }catch (ValoreNonValidoException e){
            System.out.println(e.getMessage());
        }

        try {
            m1.addComponente(new Sonda(25,"sonda interessante",TipoSonda.AUDIOSENSORI));
        }catch (ValoreNonValidoException e){
            System.out.println(e.getMessage());
        }

        //inizializzazione missile 2
        try {
            m2.addComponente(new Motore(6000,"motore carismatico",500,2));
        }catch (ValoreNonValidoException e){
            System.out.println(e.getMessage());
        }

        try {
            m2.addComponente(new Serbatoio(10000,"serbatoio carismatico",20000));
        }catch (ValoreNonValidoException e){
            System.out.println(e.getMessage());
        }

        f1.addMissile(m1);
        f2.addMissile(m2);

        System.out.println(f1);
        System.out.println(f2);

        try{
            f1.getDatiMissile("gianni");
        }catch (MissileNonPresenteException e){
            System.out.println(e.getMessage());
        }

        if(f1.getNumeroMissiliVolanti() > f2.getNumeroMissiliVolanti())
            System.out.println(f1.getNome() +" ha piu' missili volanti");
        else
            System.out.println(f2.getNome() +" ha piu' missili volanti");

    }
}
