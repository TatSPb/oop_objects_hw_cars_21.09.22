package Animals;

public class Flightless extends Birds {
    public static final String ORDER = "Нелетающие";

    public Flightless(String name, int age, String habitat, String movementType) {
        super(name, age, habitat, movementType);
        System.out.println();
        System.out.println(
                getClass() + ". \n"
                        + "Вид: " + getName() + ". \n"
                        + "Возраст " + getAge() + ". \n"
                        + "Царство: " + KINGDOM + ". \n"
                        + "Класс: " + CLASS + ". \n"
                        + "Отряд: " + ORDER + ". \n"
                        + "Среда проживания: " + getHabitat() + ". \n"
                        + "Скорость перемещения: " + getMovementType() + ". \n"
        );
    }

    public void walk() {
        System.out.println(getName() + ": я гуляю");
    }


}
