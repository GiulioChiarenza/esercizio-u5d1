package giuliochiarenza.esercizio.u5d1.entities;

import lombok.Getter;

@Getter
public abstract class MenùItem {

    public int calorie;
    public double price;

    public MenùItem(int calorie, double price) {
        this.calorie = calorie;
        this.price = price;
    }

    public int getCalorie() {
        return calorie;
    }

    public double getPrice() {
        return price;
    }
}

