package restaurant;

public class Restaurant {

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.addItem("quesadilla", "cheesy goodness", "entree", 4.99);
        menu.addItem("tacos", "crunchy goodness", "entree", 2.50);
        menu.addItem("fried ice cream", "creamy goodness", "dessert", 1.00);
        menu.addItem("fries", "starchy goodness", "side", 1.50);

        System.out.println(menu.display());
        System.out.println(menu.getItems().get("tacos").display());

        menu.removeItem("tacos");
        System.out.println(menu.display());
    }


}
