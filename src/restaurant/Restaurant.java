package restaurant;

public class Restaurant {

    public static void main (String[] args) {
        Menu menu = new Menu();
        menu.addItem("quesadilla", new MenuItem("quesadilla", "cheesy goodness", "entree", 4.99 ));
        menu.addItem("tacos", new MenuItem("tacos", "crunchy goodness", "entree", 2.50 ));
        menu.addItem("fried ice cream", new MenuItem("fried ice cream", "creamy goodness", "dessert", 1.00 ));
        menu.addItem("fries", new MenuItem("fries", "starchy goodness", "side", 1.50 ));
        System.out.println(menu.display());
        System.out.println(menu.getItems().get("tacos").display());
        menu.removeItem("tacos");
        System.out.println(menu.display());
    }


}
