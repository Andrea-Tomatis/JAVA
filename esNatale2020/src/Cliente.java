import java.util.Calendar;
import java.util.Objects;

public class Cliente {
    private String denominazione, indirizzo;

    public Cliente(String denominazione, String indirizzo){
        this.denominazione = denominazione;
        this.indirizzo = indirizzo;
    }

    public String getDenominazione() {
        return denominazione;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }


    public boolean equals(Cliente c) {
        return c.getDenominazione() == this.denominazione && c.getIndirizzo() == this.indirizzo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(denominazione, indirizzo);
    }

    public String toString(){
        return denominazione + " " + indirizzo + ":\n";
    }
}
