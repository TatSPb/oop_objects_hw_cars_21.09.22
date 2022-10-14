import Transport.Bus;
import Transport.Car;
import Transport.Motorcar;
import Transport.Train;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
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

        //КАК ВНЕСТИ ДАТУ????
        //audiA8.setInsurance(new Car.Insurance(2016-05-20, 30000, "123456789" );
        audiA8.getInsurance().checkExpireDate();
        audiA8.getInsurance().checkInsuranceNumber();
        audiA8.setKey(new Car.Key(true, true));

        Car bmwZ8 = new Car(
                "BMW",
                "Z8",
                3.0,
                "черный",
                2021,
                "Германия"
        );
        bmwZ8.setSummerTyres(false);

        System.out.println("\n********* class MOTORCAR *********");

        Motorcar kiaSportage = new Motorcar("KIA", "SPORTAGE", 2022, "Korea", 280 , "Violet");
        Motorcar huyndaiAvante = new Motorcar(
                "HYUNDAI",
                "ADVANCE",
                2020,
                "Korea",
                "Yellow",
                150,
                1.2,
                "manual",
                "sedan",
                "g258gg178",
                5,
                false
        );


        /***** CAR СТРАХОВКА И ДОСТУП ****/
        Car.Insurance ladaGrandeIns = new Car.Insurance(null, 3263.23, "#2398");
        System.out.println(ladaGrandeIns);


        System.out.println("\n********* class TRAIN *********");

        Train lastochka = new Train(
                "Lastochka",
                "B-901",
                2011,
                "Russia",
                null,
                301,
                3500,
                1,
                "Belorusskiy vokzal",
                "Minsk-Passazhirskiy",
                11);

        Train leningrad = new Train(
                "Leningrad",
                "D-125",
                2019,
                "Russia",
                null,
                 270,
                1700,
                1,
                "Liningradskiy vokzal",
                "Leningrad-Passazhirskiy",
                8);

        System.out.println("\n********* class BUS *********");
        Bus liaz5292 = new Bus("LiAZ", "5292", 2020, "Russia",90, "pink" );
        Bus paz3205 = new Bus("PAZ", "3205", 2022, "Russia",110, "white" );
        Bus nefaz3205 = new Bus("NEFAZ", "5299", 2021, "Russia",120, "blue" );
    }




//    private static void calculate(Flower[] bouquet) {
//        int lifeSpan = Integer.MAX_VALUE; //максимально возможное число
//        double sum = 0;
//        String text = "В букете есть: \n";
//
//        //ищем минимальный срок стояния:
//        for (int i = 0; i < bouquet.length; i++) {
//            if (bouquet[i] != null) {
//                text += " " + bouquet[i].getFlowerName() + " из " + bouquet[i].getFlowerCountry() + "\n";
//                if (bouquet[i].getLifeSpan() < lifeSpan) {
//                    lifeSpan = bouquet[i].getLifeSpan();
//                }
//                sum += bouquet[i].getFlowerCost();
//            }
//        }
//        sum = sum * 1.10;
//        text += "\n";
//        text += "Стоимость букета = " + String.format(" %.2f ", sum);
//        text += "\n";
//        text += "Срок стояния: " + lifeSpan;
//        System.out.println(text);
//    }

    //        System.out.println("\n********* class HUMAN *********\n");
//        Human maksim = new Human(35, "Максим", "Минск", "бренд-менеджера");
//        Human anya = new Human(29, "Аня", "Москва", "методиста образовательных программ");
//        Human katya = new Human(28, "Катя", "Калининград", "продакт-менеджера");
//        Human artem = new Human(27, "Артем", "Москва", "директора по развитию бизнеса");
//        Human test = new Human(-15);
//        Human vladimir = new Human(21, "Владимир", "  ", null);
//
//        System.out.println("\n********* class FLOWER *********\n");
//        Flower rose = new Flower("Роза обыкновенная", null, "Голландия", 35.59, 0);
//        Flower chrysanthemum = new Flower("Хризантема", null, null, 15.00, 5);
//        Flower peony = new Flower("Пион", null, "Англия", 69.90, 1);
//        Flower gypsophila = new Flower("Гипсофила", null, "Турция", 19.50, 10);
//
//        Flower[] bouquet = new Flower[10];
//        bouquet[0] = rose;
//        bouquet[1] = chrysanthemum;
//        bouquet[2] = peony;
//        bouquet[3] = gypsophila;
//
//        calculate(bouquet);
}