/*
22) Le Figure si dividono in Cerchi, Quadrati e Triangoli. Ogni figura mette a disposizione i metodi draw() e erase()
per rispettivamente stampare e cancellare la figura. Ipotizzando che draw() e erase() stampino semplicemente delle
stringhe (esempio “Cerchio disegnato" e “Cerchio cancellato") che riportano l’operazione che si sta eseguendo. Realizzare
le varie classi a partire dall'interfaccia Figura. Creare una nuova classe RandomShapeGenerator che mediante un metodo
next() ritorni in modo random un’istanza di Circle, Square o Triangolo.
*/


public class Test {
    public static void main(String[] args) {
        RandomShapeGenerator r = new RandomShapeGenerator();
        for(int i = 0; i < 10; i++){
            Figura f = r.next();
            f.draw();
        }

    }
}
