import Transport.Car;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n********* class HUMAN *********\n");
        Human maksim = new Human(35, "Максим", "Минск", "бренд-менеджера");
        Human anya = new Human(29, "Аня", "Москва", "методиста образовательных программ");
        Human katya = new Human(28, "Катя", "Калининград", "продакт-менеджера");
        Human artem = new Human(27, "Артем", "Москва", "директора по развитию бизнеса");
        Human test = new Human(-15);
        Human vladimir = new Human(21, "Владимир", "  ", null);

        System.out.println("\n********* class FLOWER *********\n");
        Flower rose = new Flower("Роза обыкновенная", null, "Голландия", 35.59, 0);
        Flower chrysanthemum = new Flower("Хризантема", null, null, 15.00, 5);
        Flower peony = new Flower("Пион", null, "Англия", 69.90, 1);
        Flower gypsophila = new Flower("Гипсофила", null, "Турция", 19.50, 10);

        Flower[] bouquet = new Flower[10];
        bouquet[0] = rose;
        bouquet[1] = chrysanthemum;
        bouquet[2] = peony;
        bouquet[3] = gypsophila;

        calculate(bouquet);

        System.out.println("\n********* class CAR *********");
        Car ladaGrande = new Car(
                "Lada",
                "Grande",
                1.7,
                "желтый",
                2015,
                "Россия"
//КАК ЧЕРЕЗ КОНСТРУКТОР ВНЕСТИ ДАННЫЕ ПО ВЛОЖЕННЫМ КЛАССАМ???
//                ,"механическая",
//                "седан",
//                "123456789",
//                5,
//                (true, true),
//        (2022-09-13, 10000.00, 123456789)
        );


        Car audiA8 = new Car(
                "Audi",
                "A8 50 L TDI quattro",
                3.0,
                "черный",
                2020,
                "Германия"
        );
        audiA8.setTransmission("автомат");

        Car bmwZ8 = new Car(
                "BMW",
                "Z8",
                3.0,
                "черный",
                2021,
                "Германия"
        );
        bmwZ8.setSummerTyres(false);

        Car kiaSportage4 = new Car(
                "Kia",
                "Sportage поколение 4",
                2.4,
                "красный",
                2018,
                "Южная Корея"
        );
      kiaSportage4.setNumberOfSeats(7);

        Car hyundaiAvante = new Car(
                "Hyundai",
                "Avante",
                1.6,
                "оранжевый",
                2016,
                "Южная Корея"
        );

        /***** CAR СТРАХОВКА И ДОСТУП ****/
        Car.Insurance ladaGrandeIns = new Car.Insurance(null, 3263.23, "#2398");
        System.out.println(ladaGrandeIns);
    }

    private static void calculate(Flower[] bouquet) {
        int lifeSpan = Integer.MAX_VALUE; //максимально возможное число
        double sum = 0;
        String text = "В букете есть: \n";

        //ищем минимальный срок стояния:
        for (int i = 0; i < bouquet.length; i++) {
            if (bouquet[i] != null) {
                text += " " + bouquet[i].getFlowerName() + " из " + bouquet[i].getFlowerCountry() + "\n";
                if (bouquet[i].getLifeSpan() < lifeSpan) {
                    lifeSpan = bouquet[i].getLifeSpan();
                }
                sum += bouquet[i].getFlowerCost();
            }
        }
        sum = sum * 1.10;
        text += "\n";
        text += "Стоимость букета = " + String.format(" %.2f ", sum);
        text += "\n";
        text += "Срок стояния: " + lifeSpan;
        System.out.println(text);
    }
}