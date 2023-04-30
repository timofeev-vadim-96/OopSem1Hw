public class Diapers extends Childrens{
    int size;
    int maxWeight;
    int minWeight;
    String type;
    public Diapers(int size, int maxWeight, int minWeight, String type, int minAge, String title,
                   double price, int quantity, String unit, boolean hypoallergenic) {
        super(minAge, title, price, quantity, unit, hypoallergenic);
        this.size = size;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
        this.type = type;

    }

    @Override
    public String toString() {
        return String.format("Название: %s, цена: %s, количество: %s, ед.изм.: %s, мин.возраст: %s, " +
                        "гипоаллергенность: %s, размер: %s, макс. вес: %s, мин. вес: %s, тип: %s",
                super.title, super.price, super.quantity, super.unit, this.minAge, this.hypoallergenic,
                this.size, this.maxWeight, this.minWeight, this.type);
    }
}
