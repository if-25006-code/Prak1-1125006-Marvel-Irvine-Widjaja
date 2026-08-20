public class Mainmenu {
    public static void main(String[] args) {

        Menu espresso = new Menu("Espresso", 20000, "Beverage");
        Menu croissant = new Menu("Croissant", 25000, "Food");
        Menu matcha = new Menu("Matcha", 22000, "Beverage");
        Menu sandwich = new Menu("Sandwich", 30000, "Food");

        System.out.println("=== CAFE MENU ===");

        espresso.showMenu();
        System.out.println();

        croissant.showMenu();
        System.out.println();

        matcha.showMenu();
        System.out.println();

        sandwich.showMenu();
    }
}