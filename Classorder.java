public class Classorder {
    public static void main(String[] args) {

        Menu espresso = new Menu("Espresso", 20000, "Beverage");
        Menu croissant = new Menu("Croissant", 25000, "Food");
        Menu matcha = new Menu("Matcha", 22000, "Beverage");
        Menu sandwich = new Menu("Sandwich", 30000, "Food");

        // Menampilkan semua menu
        System.out.println("=== CAFE MENU ===");

        espresso.showMenu();
        System.out.println();

        croissant.showMenu();
        System.out.println();

        matcha.showMenu();
        System.out.println();

        sandwich.showMenu();
        System.out.println();

        // Diskon Espresso
        System.out.println("=== DISCOUNT ===");
        System.out.println("Espresso");
        System.out.println("Original Price : Rp" + (int) espresso.price);
        System.out.println("Discount 10% : Rp" + (int) espresso.discount(10));

        // Mengubah harga Croissant
        croissant.changePrice(28000);

        // Menampilkan setelah update
        System.out.println();
        System.out.println("=== AFTER UPDATE ===");

        System.out.println("Espresso");
        System.out.println("Original Price : Rp" + (int) espresso.price);
        System.out.println("Discount 10% : Rp" + (int) espresso.discount(10));

        System.out.println();

        System.out.println("Croissant");
        System.out.println("New Price : Rp" + (int) croissant.price);

        // Total menu
        System.out.println();
        System.out.println("Total Menu : " + Menu.totalMenu);
    }
}