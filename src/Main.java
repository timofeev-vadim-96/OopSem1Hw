//Домашнее задание к 1 семинару по ООП на Java
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new LinkedList<>();
        Bread bread1 = new Bread("Мука 1 сорта", new Date(07, 05, 2023), "Батон", 55.80, 50, "шт.");
        Diapers diapers1 = new Diapers(16, 30, 4, "одноразовые", 2,
                "Хаггис", 250.44, 2000, "шт.", true);
        Egg egg = new Egg(30, new Date(07, 06, 2023), "c0", 153.69, 50, "упак.");
        Lemonade lemonade = new Lemonade(2.0, "Фанта", 120.00, 200, "шт.");
        Mask mask = new Mask(5, "Гарниер", 88.90, 140, "упак.");
        Milk milk = new Milk(2.0, new Date(14, 05, 2023), 0.9, "Веселый" +
                "молочник", 95.80, 160, "шт.");
        Pacifier pacifier = new Pacifier(1, "Соска-пустышка Bigs", 30.80, 123,
                "шт.", true);
        ToiletPaper toiletPaper = new ToiletPaper(2, 8, "Zewa",
                232.53, 50, "упак.");
        products.add(bread1);
        products.add(diapers1);
        products.add(egg);
        products.add(lemonade);
        products.add(mask);
        products.add(milk);
        products.add(pacifier);
        products.add(toiletPaper);

        products.forEach(a -> System.out.println(a));


    }
}