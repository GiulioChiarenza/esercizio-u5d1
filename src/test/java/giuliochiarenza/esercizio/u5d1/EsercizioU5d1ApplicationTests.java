package giuliochiarenza.esercizio.u5d1;

import giuliochiarenza.esercizio.u5d1.entities.Drink;
import giuliochiarenza.esercizio.u5d1.entities.Ordine;
import giuliochiarenza.esercizio.u5d1.entities.Pizza;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@ComponentScan
class EsercizioU5d1ApplicationTests {

	@Autowired
	private Pizza pizzaMargheritaBean;

	@Autowired
	private Pizza pizzaHawaiianBean;

	@Autowired
	private Pizza pizzaSalamiBean;

	@Test
	public void testBeansCreation() {
		assertNotNull(pizzaMargheritaBean);
		assertNotNull(pizzaHawaiianBean);
		assertNotNull(pizzaSalamiBean);

	}

}
