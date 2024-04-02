package giuliochiarenza.esercizio.u5d1.entities;

public class Topping {
    public String name;
    public int calories;
    public double Price;

    public Topping(String name, int calories, double price) {
        this.name = name;
        this.calories = calories;
        Price = price;
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
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "Topping{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", Price=" + Price +
                '}';
    }
}
