public class Hygiene extends Product{
    int quantityInAPackage;
    public Hygiene(int quantityInAPackage, String title, double price, int quantity, String unit) {
        super(title, price, quantity, unit);
        this.quantityInAPackage = quantityInAPackage;
    }

    @Override
    public String toString() {
        return String.format("Название: %s, цена: %s, количество: %s, ед.изм.: %s, кол-во в упаковке: %s",
                super.title, super.price, super.quantity, super.unit, this.quantityInAPackage);
    }
}
