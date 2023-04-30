public class ToiletPaper extends Hygiene{
    int numbOfLayers;
    public ToiletPaper(int numbOfLayers, int quantityInAPackage, String title, double price, int quantity, String unit) {
        super(quantityInAPackage, title, price, quantity, unit);
        this.numbOfLayers = numbOfLayers;
    }

    @Override
    public String toString() {
        return String.format("Название: %s, цена: %s, количество: %s, ед.изм.: %s, кол-во в упаковке: %s, " +
                        "количество слоев: %s", super.title, super.price, super.quantity, super.unit,
                this.quantityInAPackage, this.numbOfLayers);
    }
}
