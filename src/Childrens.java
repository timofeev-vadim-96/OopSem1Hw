public class Childrens extends Product{
    int minAge;
    boolean hypoallergenic;
    public Childrens(int minAge, String title, double price, int quantity, String unit,
                     boolean hypoallergenic) {
        super(title, price, quantity, unit);
        this.minAge = minAge;
        this.hypoallergenic = hypoallergenic;
    }

    @Override
    public String toString() {
        return String.format("Название: %s, цена: %s, количество: %s, ед.изм.: %s, мин.возраст: %s, " +
                        "гипоаллергенность: %s", super.title, super.price, super.quantity, super.unit,
                this.minAge, this.hypoallergenic);
    }
}
