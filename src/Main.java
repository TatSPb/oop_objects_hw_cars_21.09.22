public class Main {
    public static void main(String[] args) {
        System.out.println("class HUMAN");
        Human maksim = new Human(35, "Максим", "Минск", "бренд-менеджера");
        Human anya = new Human(29, "Аня", "Москва", "методиста образовательных программ");
        Human katya = new Human(28, "Катя", "Калининград", "продакт-менеджера");
        Human artem = new Human(27, "Артем", "Москва", "директора по развитию бизнеса");
        Human test = new Human(-15);
        Human vladimir = new Human(21, "Владимир", "  ", null);

        System.out.println("\nclass FLOWER");
        Flower rose = new Flower("Роза обыкновенная", null, "Голландия", 35.59, 0);
        Flower chrysanthemum = new Flower("Хризантема", null, null, 15.00, 5);
        Flower peony = new Flower("Пион", null, "Англия", 69.90, 1);
        Flower gypsophila = new Flower("Гипсофила", null, "Турция", 19.50, 10);

        Flower[] bouquet = new Flower[10];
        bouquet[0] = rose;
        bouquet[1] = chrysanthemum;
        bouquet[2] = peony;
        bouquet[3] = gypsophila;

        calculate (bouquet);
    }

    private static void calculate(Flower [] bouquet) {
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
        sum = sum *1.10;
        text += "\n";
        text += "Стоимость букета = " + String.format(" %.2f ", sum);
        text += "\n";
        text += "Срок стояния: " + lifeSpan;
        System.out.println(text);
    }
}