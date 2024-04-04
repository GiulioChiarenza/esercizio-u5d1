package giuliochiarenza.esercizio.u5d1;


import giuliochiarenza.esercizio.u5d1.entities.*;
import giuliochiarenza.esercizio.u5d1.entities.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.awt.*;

@Component
public class MyRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(EsercizioU5d1Application.class);
        try {
            Menu m = (Menu) ctx.getBean("menu");
            m.printMenu();

            Tavolo t1 = (Tavolo) ctx.getBean("Tavolo1");

            Ordine o1 = new Ordine(4, t1);

            o1.addItem(ctx.getBean("pizzaMargheritaBean", Pizza.class));
            o1.addItem(ctx.getBean("pizzaHawaiianBean", Pizza.class));
            o1.addItem(ctx.getBean("pizzaSalamiXlBean", Pizza.class));
            o1.addItem(ctx.getBean("lemonade", Drink.class));
            o1.addItem(ctx.getBean("lemonade", Drink.class));
            o1.addItem(ctx.getBean("wine", Drink.class));

            System.out.println("DETTAGLI TAVOLO 1:");
            o1.print();

            System.out.println("CONTO TAVOLO 1");
            System.out.println(o1.getTotal());
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        } finally {
            ctx.close();
        }
    }
}
