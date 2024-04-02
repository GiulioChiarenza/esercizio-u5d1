package giuliochiarenza.esercizio.u5d1;

import giuliochiarenza.esercizio.u5d1.entities.Drink;
import giuliochiarenza.esercizio.u5d1.entities.Menù;
import giuliochiarenza.esercizio.u5d1.entities.Pizza;
import giuliochiarenza.esercizio.u5d1.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.awt.*;

@Configuration
public class BeansConfig {

    @Bean
    public Pizza margherita() {
        return new Pizza("Margherita", 1104, 4.99);
    }
    @Bean
    public Pizza hawaianPizza() {
        Pizza hawaianPizza = new Pizza("Hawaian Pizza", 1234, 6.49);
        hawaianPizza.addTopping("ham");
        hawaianPizza.addTopping("pineapple");
        return hawaianPizza;
    }
    @Bean
    public Pizza salamiPizza() {
        Pizza salamiPizza = new Pizza("Salami Pizza", 1300, 5.99);
        salamiPizza.addTopping("Salami");
        return salamiPizza;
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
    @Bean
    public Menù menu(Pizza margherita, Pizza hawaianPizza, Pizza salamiPizza, Topping ham, Topping cheese, Topping onion, Topping pineapple, Drink lemonade, Drink water, Drink wine) {
        Menù menu = new Menù();

        menu.addItem(margherita);
        menu.addItem(hawaianPizza);
        menu.addItem(salamiPizza);
        menu.addItem(ham);
        menu.addItem(cheese);
        menu.addItem(onion);
        menu.addItem(pineapple);
        menu.addItem(lemonade);
        menu.addItem(water);
        menu.addItem(wine);
        return menu;
    }
}
