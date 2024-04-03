package giuliochiarenza.esercizio.u5d1.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public  class Menù {

    public List<MenùItem> items;

    public Menù() {
        this.items = new ArrayList<>();
    }

    public void addItem(MenùItem item) {
        this.items.add(item);
    }

    public List<MenùItem> getItems() {
        return items;
    }

    public void setItems(List<MenùItem> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Menù{" +
                "items=" + items +
                '}';
    }


}
