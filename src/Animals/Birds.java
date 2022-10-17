package Animals;

public abstract class Birds extends Animals {
    public static final String  CLASS = "Птицы";
    private String movementType;


    public Birds(String name, int age, String habitat, String movementType) {
        super(name, age, habitat);
        this.movementType = movementType;
    }
    public void eat() {
        System.out.println(getName() + ": я ем");
    }
    public void sleep() {
        System.out.println(getName() + ": я сплю");
    }
    public void move() {
        System.out.println(getName() + ": я перемещаюсь");
    }

    public void hunt() {
        System.out.println(getName() + ": я охочусь");
    };

    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        this.movementType = movementType;
    }
}


