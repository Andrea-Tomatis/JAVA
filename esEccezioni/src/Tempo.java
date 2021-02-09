public class Tempo {
    private int ore, minuti;

    public Tempo(){
        ore = 0;
        minuti = 0;
    }

    public Tempo(int minuti, int ore) throws FormatoTempoScorrettoException{
        setMinuti(minuti);
        setOre(ore);
    }

    public void setOre(int ore) throws FormatoTempoScorrettoException {
        if(ore >= 0 && ore <= 23) this.ore = ore;
        else throw new FormatoTempoScorrettoException("errore: formato ore non valido");
    }

    public void setMinuti(int minuti) throws FormatoTempoScorrettoException{
        if(minuti >= 0 && minuti <= 59) this.minuti = minuti;
        else throw new FormatoTempoScorrettoException("errore: formato minuti non valido");
    }

    public int getOre() {
        return ore;
    }

    public int getMinuti() {
        return minuti;
    }
}
