package giuliochiarenza.esercizio.u5d1.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public  class Menù {

    public List<Object> items;

    public Menù() {
        this.items = new ArrayList<>();
    }

    public void addItem(Object item) {
        this.items.add(item);
    }

    public List<Object> getItems() {
        return items;
    }

    public void setItems(List<Object> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Menù{" +
                "items=" + items +
                '}';
    }
}
