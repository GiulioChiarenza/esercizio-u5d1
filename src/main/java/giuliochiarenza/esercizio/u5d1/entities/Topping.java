package giuliochiarenza.esercizio.u5d1.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Topping extends MenùItem {
    public String name;

    public Topping(String name, int calorie, double price) {
        super(calorie, price);
        this.name = name;
    }


    @Override
    public String toString() {
        return "Topping{" +
                "name='" + name + '\'' +
                ", calories=" + calorie +
                ", Price=" + price +
                '}';
    }
}
