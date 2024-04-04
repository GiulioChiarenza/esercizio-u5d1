package giuliochiarenza.esercizio.u5d1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
@Getter
@ToString
@AllArgsConstructor
@Component
public class Menu {

    private List<Pizza> pizzaList;
    private List<Drink> drinkList;
    private List<Topping> toppingList;

    public void printMenu() {
        System.out.println("******* Menu *******");
        System.out.println("PIZZAS");
        this.pizzaList.forEach(System.out::println);
        System.out.println();

        System.out.println("TOPPINGS");
        this.toppingList.forEach(System.out::println);
        System.out.println();

        System.out.println("DRINKS");
        this.drinkList.forEach(System.out::println);
        System.out.println();

    }

}
