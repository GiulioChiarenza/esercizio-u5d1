package giuliochiarenza.esercizio.u5d1.entities;

public class Topping extends MenùItem {
    public String name;


    public Topping(String name, int calorie, double price) {
        this.name = name;
        this.calorie = calorie;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calorie;
    }

    public void setCalories(int calories) {
        this.calorie = calories;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        price = price;
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
