package giuliochiarenza.esercizio.u5d1.entities;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
@Getter
public class Pizza extends MenùItem {

public String name;

public List<Topping> toppings;
public boolean isXl = false;

    public Pizza(String name, List<Topping> toppingList, boolean isXl) {
        super(700, 4.3);
        this.name = name;
        this.toppings = toppingList;
        this.isXl = isXl;
    }
    @Override
    public int getCalorie() {
        return super.getCalorie() + this.getToppings().stream().mapToInt(Topping::getCalorie).sum();
    }

    @Override
    public double getPrice() {
        return super.getPrice() + this.getToppings().stream().mapToDouble(Topping::getPrice).sum();
    }

    public String getName() {
        return name;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public boolean isXl() {
        return isXl;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", calories=" + calorie +
                ", price=" + price +
                ", toppingList=" + toppings +
                ", isXl=" + isXl +
                '}';
    }
}
