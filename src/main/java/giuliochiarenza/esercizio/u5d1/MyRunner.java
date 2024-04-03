package giuliochiarenza.esercizio.u5d1;

import giuliochiarenza.esercizio.u5d1.dao.OrdineDAO;
import giuliochiarenza.esercizio.u5d1.entities.Menù;
import giuliochiarenza.esercizio.u5d1.entities.Ordine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {
@Autowired
private OrdineDAO ordineDAO;


    @Override
    public void run(String... args) throws Exception {

    }
}
