package restaurant;

import java.util.Date;
import java.util.HashMap;
import restaurant.MenuItem;

public class Menu {
    public HashMap<String, MenuItem> items;
    private Date lastUpdate;
    private static final int NEW_THRESHOLD = 30;

    public Menu() {
        this.items = new HashMap<>();
        this.lastUpdate = new Date();
    }

    public Menu(Date lastUpdate) {
        this.items = new HashMap<>();
        this.lastUpdate = lastUpdate;
    }

    public void addItem(String name, MenuItem item) {
        this.items.put(name, item);
    }

    public String display() { //TODO: implement display
        return "";
    }
}
