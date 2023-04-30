public class Product {
    protected String title;
    protected double price;
    protected int quantity;
    protected String unit;

    public Product(String title, double price, int quantity, String unit) {
        this.title = title;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
    }

    public Product(String title, double price, int quantity) {
        this(title, price, quantity, "шт.");
    }

    @Override
    public String toString() {
        return String.format("Название: %s, цена: %s, количество: %s, ед.изм.: %sг.",
                title, price, quantity, unit);
    }
}
