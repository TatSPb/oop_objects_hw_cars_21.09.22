package Animals;

public class Amphibians extends Animals {
    public static final String CLASS = "Земноводные";


    public Amphibians(String name, int age, String habitat) {
        super(name, age, habitat);
        System.out.println();
        System.out.println(
                getClass() + ". \n"
                        + "Вид: " + getName() + ". \n"
                        + "Возраст " + getAge() + ". \n"
                        + "Царство: " + KINGDOM + ". \n"
                        + "Класс: " + CLASS + ". \n"
                        + "Среда проживания: " + getHabitat() + ". \n"
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

    public void hunt() {
        System.out.println(getName() + ": я охочусь");
    }

}
