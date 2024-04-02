package giuliochiarenza.esercizio.u5d1.entities;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

public String name;
public int calories;
public double price;
public List<String> toppings;

    public Pizza(String name, int calories, double price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
        this.toppings = new ArrayList<>();
        this.toppings.add("pomodoro");
        this.toppings.add("mozzarella");
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

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
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
                ", calories=" + calories +
                ", price=" + price +
                ", toppings=" + toppings +
                '}';
    }
}
