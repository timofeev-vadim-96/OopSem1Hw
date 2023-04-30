public class Egg extends Food{
    int quantityInAPackage;
    public Egg(int quantityInAPackage, Date expiration_date, String title, double price, int quantity, String unit) {
        super(expiration_date, title, price, quantity, unit);
        this.quantityInAPackage = quantityInAPackage;
    }

    @Override
    public String toString() {
        return String.format("Название: %s, цена: %s, количество: %s, ед.изм.: %s, срок годности: %s, количество в упаковке: %s",
                super.title, super.price, super.quantity, super.unit, this.expiration_date, this.quantityInAPackage);
    }
}
