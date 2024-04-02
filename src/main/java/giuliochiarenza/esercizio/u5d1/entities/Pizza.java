package giuliochiarenza.esercizio.u5d1.entities;

import java.util.ArrayList;
import java.util.List;

public class Pizza extends MenùItem {

public String name;

public List<String> toppings;

    public Pizza(String name, int calorie, double price) {
        this.name = name;
        this.calorie = calorie;
        this.price = price;
        this.toppings = new ArrayList<>();
        this.toppings.add("tomato");
        this.toppings.add("cheese");
    }
    public void addTopping(String topping) {
        this.toppings.add(topping);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", calories=" + calorie +
                ", price=" + price +
                ", toppings=" + toppings +
                '}';
    }
}
