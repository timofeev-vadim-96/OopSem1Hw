public class Drink extends Product{
    double volume; // объем
    public Drink(double volume, String title, double price, int quantity, String unit) {
        super(title, price, quantity, unit);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return String.format("Название: %s, цена: %s, количество: %s, ед.изм.: %s, объем: %s",
                super.title, super.price, super.quantity, super.unit, this.volume);
    }
}
