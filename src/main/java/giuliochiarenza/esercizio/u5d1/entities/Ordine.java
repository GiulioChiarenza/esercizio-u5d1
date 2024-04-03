package giuliochiarenza.esercizio.u5d1.entities;

import lombok.ToString;

import java.time.LocalTime;
import java.util.List;
@ToString
public class Ordine {

    public List<String> ordine;
    public int numOrdine;
    public StatoOrdini statoOrdini;
    public int numCoperti;
    public LocalTime oraPrenotazione;
    public double conto;
    public int coperto;

    public Ordine() {

    }

    public Ordine(List<String> ordine, int numOrdine, StatoOrdini statoOrdini, int numCoperti, LocalTime oraPrenotazione, double conto, int coperto) {
        this.ordine = ordine;
        this.numOrdine = numOrdine;
        this.statoOrdini = statoOrdini;
        this.numCoperti = numCoperti;
        this.oraPrenotazione = oraPrenotazione;
        this.conto = conto;
        this.coperto = coperto;
    }

    public List<String> getOrdine() {
        return ordine;
    }

    public void setOrdine(List<String> ordine) {
        this.ordine = ordine;
    }

    public int getNumOrdine() {
        return numOrdine;
    }

    public void setNumOrdine(int numOrdine) {
        this.numOrdine = numOrdine;
    }

    public StatoOrdini getStatoOrdini() {
        return statoOrdini;
    }

    public void setStatoOrdini(StatoOrdini statoOrdini) {
        this.statoOrdini = statoOrdini;
    }

    public int getNumCoperti() {
        return numCoperti;
    }

    public void setNumCoperti(int numCoperti) {
        this.numCoperti = numCoperti;
    }

    public LocalTime getOraPrenotazione() {
        return oraPrenotazione;
    }

    public void setOraPrenotazione(LocalTime oraPrenotazione) {
        this.oraPrenotazione = oraPrenotazione;
    }

    public double getConto() {
        return conto;
    }

    public void setConto(double conto) {
        this.conto = conto;
    }
    public int getCoperto() {
        return coperto;
    }

    public void setCoperto(int coperto) {
        this.coperto = coperto;
    }
}
