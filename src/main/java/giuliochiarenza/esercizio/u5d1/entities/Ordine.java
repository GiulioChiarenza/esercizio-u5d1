package giuliochiarenza.esercizio.u5d1.entities;

import lombok.ToString;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@ToString
public class Ordine {

    public List<MenùItem> ordine;
    public int numOrdine;
    public StatoOrdini statoOrdini;
    public int numCoperti;
    public LocalTime oraPrenotazione;
    public Tavolo tavolo;


    public Ordine(int numCoperti, Tavolo table) {
        Random rndm = new Random();
        if (table.getMaxCoperti() <= numCoperti)
            throw new RuntimeException("Numero coperti maggiore di numero massimo posti sul tavolo!");
        this.numOrdine = rndm.nextInt(1000, 100000);
        this.statoOrdini = StatoOrdini.INCORSO;
        this.numCoperti = numCoperti;
        this.oraPrenotazione = LocalTime.now();
        this.ordine = new ArrayList<>();
        this.tavolo = table;
    }
        public void addItem (MenùItem item){
            this.ordine.add(item);
        }

        public double getTotal () {
            return this.ordine.stream().mapToDouble(MenùItem::getPrice).sum() + (this.tavolo.getCostoCoperto() * this.numCoperti);
        }

        public void print () {
            System.out.println("id ordine--> " + this.numOrdine);
            System.out.println("stato--> " + this.statoOrdini);
            System.out.println("numero coperti--> " + this.numCoperti);
            System.out.println("ora prenotazione--> " + this.oraPrenotazione);
            System.out.println("numero tavolo--> " + this.tavolo.getNum());
            System.out.println("Lista: ");
            this.ordine.forEach(System.out::println);
            System.out.println("totale--> " + this.getTotal());

        }

}
