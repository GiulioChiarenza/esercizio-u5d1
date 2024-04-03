package giuliochiarenza.esercizio.u5d1.entities;

import lombok.ToString;

@ToString
public class Tavolo {

    public int num ;
    public int maxCoperti;
    public Stato stato;

    public Tavolo(int num, int maxCoperti, Stato stato) {
        this.num = num;
        this.maxCoperti = maxCoperti;
        this.stato = stato;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getMaxCoperti() {
        return maxCoperti;
    }

    public void setMaxCoperti(int maxCoperti) {
        this.maxCoperti = maxCoperti;
    }

    public Stato getStato() {
        return stato;
    }

    public void setStato(Stato stato) {
        this.stato = stato;
    }
}
