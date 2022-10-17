package Animals;

public abstract class Mammalia extends Animals {
    public static final String  CLASS = "Млекопитающие";
    private double movementSpeed;


    public Mammalia(String name, int age, String habitat, double movementSpeed) {
        super(name, age, habitat);
        this.movementSpeed = movementSpeed;
    }

    public void walk() {
        System.out.println(getName() + ": я гуляю");
    };

    public double getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(double movementSpeed) {
        if (movementSpeed < 0){
            this.movementSpeed = 10;
        } else {
            this.movementSpeed = movementSpeed;
        }
    }


}
