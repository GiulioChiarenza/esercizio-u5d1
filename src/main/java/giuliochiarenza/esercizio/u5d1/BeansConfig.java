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
    @Primary
    public Pizza margherita() {
        return new Pizza("Margherita", 1104, 4.99);
    }
    @Bean
    public Pizza hawaianPizza() {
        Pizza margherita = margherita();
        margherita.addTopping("ham");
        margherita.addTopping("pineapple");
        margherita.setName("Hawaian Pizza");
        return margherita;
    }
    @Bean
    public Pizza SalamiPizza(){
        Pizza margherita = margherita();
        margherita.addTopping("Salami");
        margherita.setName("Salami Pizza");
        return margherita;
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
    public Menù menu(Pizza margherita, Pizza hawaianPizza, Pizza Salami, Topping ham, Topping cheese, Topping onion, Topping pineapple, Drink lemonade, Drink water, Drink wine) {
        Menù menu = new Menù();

        menu.addItem(margherita);
        menu.addItem(hawaianPizza);
        menu.addItem(Salami);
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
