package giuliochiarenza.esercizio.u5d1.entities;

public class Drink extends  MenùItem{
    public String name;


    public Drink(String name, int calorie, double price) {
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



    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", calories=" + calorie +
                ", price=" + price +
                '}';
    }
}
