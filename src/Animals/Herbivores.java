package Animals;

public class Herbivores extends Mammalia {
    public static final String ORDER = "Травоядные";
    private final String foodType = "трава";


    public Herbivores(String name, int age, String habitat, double movementSpeed) {
        super(name, age, habitat, movementSpeed);
        System.out.println();
        System.out.println(
                getClass() + ". \n"
                        + "Вид: " + getName() + ". \n"
                        + "Возраст " + getAge() + ". \n"
                        + "Царство: " + KINGDOM + ". \n"
                        + "Класс: " + CLASS + ". \n"
                        + "Отряд: " + ORDER + ". \n"
                        + "Среда проживания: " + getHabitat() + ". \n"
                        + "Скорость перемещения: " + getMovementSpeed() + ". \n"
                        + "Тип пищи: " + getFoodType() + ". \n"
        );
    }

    public void eat() {
        System.out.println(getName() + ": я ем");
    }

    ;

    public void sleep() {
        System.out.println(getName() + ": я сплю");
    }

    ;

    public void move() {
        System.out.println(getName() + ": я перемещаюсь");
    }

    ;

    public void graze() {
        System.out.println(getName() + ": я пасусь");
    }

    ;

    public String getFoodType() {
        return foodType;
    }

}
