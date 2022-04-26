package restaurant;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class MenuItem {
    private String name;
    private String description;
    private String category;
    private double price;
    private Date dateAdded;

    public MenuItem(String name, String description, String category, double price, Date dateAdded) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.dateAdded = dateAdded;
    }

    public MenuItem(String name, String description, String category, double price) {
        this(name, description, category, price, new Date());
    }

    /**
     * Indicates whether an item is considered 'new'
     * according to the given threshold.
     *
     * @param newThreshold number of days to consider
     *      an item 'new' after it has been added.
     * @return {@code true} if the current date is less than
     *      {@code newThreshold} days after {@code dateAdded},
     *      and {@code false} otherwise.
     */
    public boolean isNew(int newThreshold) {
        Calendar cutoff = Calendar.getInstance();
        cutoff.setTime(dateAdded);
        cutoff.add(Calendar.DAY_OF_MONTH, newThreshold);
        return Calendar.getInstance().before(cutoff);
    }

    /**
     * Returns a string representing the menu item
     * as it might appear on a restaurant menu.
     *
     * @return a formatted string listing the item's
     * name, price, and description.
     */
    public String display() {
        return String.format("%1s $%2$02.2f %n %3$s", name, price, description);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return name.equals(menuItem.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }
}
