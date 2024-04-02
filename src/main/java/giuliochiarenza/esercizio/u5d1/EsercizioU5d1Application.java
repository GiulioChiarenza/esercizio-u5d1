package giuliochiarenza.esercizio.u5d1;

import giuliochiarenza.esercizio.u5d1.entities.Menù;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class EsercizioU5d1Application {

	public static void main(String[] args) {

		SpringApplication.run(EsercizioU5d1Application.class, args);
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(EsercizioU5d1Application.class);

		Menù menu = ctx.getBean(Menù.class);
		System.out.println(menu);




	}

}
