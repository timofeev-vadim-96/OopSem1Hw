public class Bread extends Food{
    String typeOfFloor;
    public Bread(String typeOfFloor, Date expiration_date, String title, double price, int quantity, String unit) {
        super(expiration_date, title, price, quantity, unit);
        this.typeOfFloor = typeOfFloor;
    }
    @Override
    public String toString() {
        return String.format("Название: %s, цена: %s, количество: %s, ед.изм.: %s, срок годности: %s, " +
                        "тип муки: %s", super.title, super.price, super.quantity, super.unit,
                this.expiration_date, this.typeOfFloor);
    }
}
