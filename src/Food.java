
public class Food extends Product{
    Date expiration_date;

    public Food(Date expiration_date, String title, double price, int quantity, String unit) {
        super(title, price, quantity, unit);
        this.expiration_date = expiration_date;
    }

    @Override
    public String toString() {
        return String.format("Название: %s, цена: %s, количество: %s, ед.изм.: %s, срок годности: %s",
                super.title, super.price, super.quantity, super.unit, this.expiration_date);
    }
}
