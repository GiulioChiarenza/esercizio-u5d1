package giuliochiarenza.esercizio.u5d1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter

public class Tavolo {

    public int num ;
    public int maxCoperti;
    public boolean libero;
    public  double costoCoperto;

    public Tavolo(int num, int maxCoperti, boolean libero, double costoCoperto) {
        this.num = num;
        this.maxCoperti = maxCoperti;
        this.libero = libero;
        this.costoCoperto = costoCoperto;
    }

    public void print() {
        System.out.println("numero tavolo--> " + num);
        System.out.println("numero massimo coperti--> " + maxCoperti);
        System.out.println("occupato/libero--> " + (this.libero ? "Libero" : "Occupato"));
    }

    public int getNum() {
        return num;
    }

    public int getMaxCoperti() {
        return maxCoperti;
    }

    public boolean isLibero() {
        return libero;
    }

    public double getCostoCoperto() {
        return costoCoperto;
    }
}
