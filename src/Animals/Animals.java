package Animals;

import java.util.regex.Pattern;

public abstract class Animals {
    public static final String  KINGDOM = "Животные";
    private final String name;
    private final int age;
    private final String habitat;

    public Animals(String name, int age, String habitat) {

        if (iisNullOrEmpty(name) && Pattern.matches("[a-zA-Z]+",name)) {
            this.name = "<не определено или указано некорректно>";
        } else {
            this.name = name;
        }
        if (age < 0){
            this.age = Math.abs(age);
        } else {
            this.age = age;
        }


        if (iisNullOrEmpty(name) && Pattern.matches("[a-zA-Z]+",habitat)) {
            this.habitat = "<не определено или указано некорректно>";
        } else {
            this.habitat = habitat;;
        }
    }

    public  abstract  void eat() ;
    public  abstract  void sleep();
    public  abstract  void move();

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static boolean iisNullOrEmpty(String value) {
        return value == null || value.isBlank();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHabitat() {
        return habitat;
    }
}
