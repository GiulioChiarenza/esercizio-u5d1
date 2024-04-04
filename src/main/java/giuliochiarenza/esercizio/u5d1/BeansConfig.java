package giuliochiarenza.esercizio.u5d1;

import giuliochiarenza.esercizio.u5d1.entities.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("classpath:application.properties")
public class BeansConfig {

    @Bean
    public Pizza pizzaMargheritaBean() {
        List<Topping> tList = new ArrayList<>();
        tList.add(Tomato());
        tList.add(cheese());
        return new Pizza("Pizza Margherita", tList, false);
    }
    @Bean
    public Pizza pizzaHawaiianBean() {
        List<Topping> tList = new ArrayList<>();
        tList.add(Tomato());
        tList.add(cheese());
        tList.add(ham());
        tList.add(pineapple());
        return new Pizza("Hawaiian Pizza", tList, false);
    }
    @Bean
    public Pizza pizzaSalamiBean() {
        List<Topping> tList = new ArrayList<>();
        tList.add(Tomato());
        tList.add(cheese());
        tList.add(salami());
        return new Pizza("Salami Pizza", tList, false);
    }
    @Bean
    public Pizza pizzaSalamiXlBean() {
        List<Topping> tList = new ArrayList<>();
        tList.add(Tomato());
        tList.add(cheese());
        tList.add(salami());
        return new Pizza("Salami Pizza XL", tList, true);
    }
    @Bean
    public Topping Tomato() {
        return new Topping("Tomato", 0, 0);
    }
    @Bean
    public Topping ham() {
        return new Topping("ham", 35,0.99);
    }

    @Bean
    public Topping cheese() {
        return new Topping("cheese", 92,0.69);
    }
    @Bean
    public Topping onion() {
        return new Topping("onion", 22,0.69);
    }
    @Bean
    public Topping pineapple() {
        return new Topping("pineapple", 24,0.79);
    }
    @Bean
    public Topping salami() {
        return new Topping("salami", 86,0.99);
    }
    @Bean
    public Drink lemonade() {
        return new Drink("lemonade", 128, 1.29);
    }
    @Bean
    public Drink water() {
        return new Drink("water", 0, 1.29);
    }
    @Bean
    public Drink wine() {
        return new Drink("wine", 607, 7.49);
    }
    @Bean("pizzas")
    List<Pizza> pizzaList() {
        List<Pizza> pizzas = new ArrayList<>();
        pizzas.add(pizzaMargheritaBean());
        pizzas.add(pizzaHawaiianBean());
        pizzas.add(pizzaSalamiBean());
        pizzas.add(pizzaSalamiXlBean());
        return pizzas;
    }

    @Bean("drinks")
    List<Drink> drinksList() {
        List<Drink> drinks = new ArrayList<>();
        drinks.add(lemonade());
        drinks.add(water());
        drinks.add(wine());
        return drinks;
    }

    @Bean("toppings")
    List<Topping> toppingsList() {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(Tomato());
        toppings.add(cheese());
        toppings.add(salami());
        toppings.add(ham());
        toppings.add(pineapple());
        return toppings;
    }


    @Bean("Tavolo1")
    Tavolo getTable1(@Value("${seat.price}") double seatPrice) {
        return new Tavolo(1, 5, true, seatPrice);
    }

    @Bean("Tavolo2")
    Tavolo getTable2(@Value("${seat.price}") double seatPrice) {
        return new Tavolo(2, 4, true, seatPrice);
    }

    @Bean("Tavolo3")
    Tavolo getTable3(@Value("${seat.price}") double seatPrice) {
        return new Tavolo(3, 8, true, seatPrice);
    }
}
