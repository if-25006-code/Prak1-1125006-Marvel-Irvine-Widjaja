public class Menu {
    String name;
    double price;
    String category;

    static int totalMenu = 0;

    public Menu(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
        totalMenu++;
    }

    public void showMenu() {
        System.out.println("Name : " + name);
        System.out.println("Price : Rp" + (int) price);
        System.out.println("Category : " + category);
    }

    public double discount(double percentage) {
        return price - (price * percentage / 100);
    }

    public void changePrice(double newPrice) {
        price = newPrice;
    }
}