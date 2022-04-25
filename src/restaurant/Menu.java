package restaurant;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Menu {
    public HashMap<String, MenuItem> items;
    private Date lastUpdate;
    private static final int NEW_THRESHOLD = 30; //number of days an item is considered 'new'

    public Menu(Date lastUpdate) {
        this.items = new HashMap<>();
        this.lastUpdate = lastUpdate;
    }

    public Menu() {
        this(new Date());
    }

    public void addItem(String name, MenuItem item) {
        this.items.put(name, item);
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String display() { //TODO: sort and categorize displayed items
        ArrayList<String> listings = new ArrayList<>(items.size());
        for (MenuItem item: items.values()) {
            listings.add(item.display());
        }
        return String.join("\n\n", listings);
    }
}
