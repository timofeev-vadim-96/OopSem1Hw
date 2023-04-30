public class Milk extends Drink{
    double fatPercent;
    Date expiration_date;
    public Milk(double fatPercent, Date expiration_date, double volume, String title, double price,
                int quantity, String unit) {
        super(volume, title, price, quantity, unit);
        this.expiration_date = expiration_date;
        this.fatPercent = fatPercent;
    }

    @Override
    public String toString() {
        return String.format("Название: %s, цена: %s, количество: %s, ед.изм.: %s, объем: %s," +
                        "процент жира: %s, срок годности: %s", super.title, super.price, super.quantity,
                super.unit, this.volume, fatPercent, expiration_date);
    }
}

