package Transport;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final int productionYear; // не изменяется
    private final String productionCountry; // не изменяется
    private String color; //  изменяется
    private double maxSpeed;  //  изменяется


    /***** TRANSPORT конструкторы ****/

    public Transport(String brand) {
        this(brand, "<DEFAULT>", 2000, "<DEFAULT>", 90, "<DEFAULT>");
        System.out.println();
        System.out.println(
                "Автомобиль: " + getBrand() + " " + getModel() + "; \n"
                        + "год выпуска: " + getProductionYear() + "; \n"
                        + "страна сборки: " + getProductionCountry() + "; \n"
                        + "цвет кузова: " + getColor() + "; \n"
                        + "MAX скорость передвижения: " + getMaxSpeed() + " км/час; \n");
    }
    public Transport(String brand, String model, int productionYear, String productionCountry,  double maxSpeed) {
        //this(brand, model, productionYear, productionCountry, maxSpeed);
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.maxSpeed = maxSpeed;
    }
    public Transport(String brand, String model, int productionYear, String productionCountry,  double maxSpeed, String color) {

        if (iisNullOrEmpty(brand)) {
            this.brand = "DEFAULT";
        } else {
            this.brand = brand;
        }

        if (iisNullOrEmpty(model)) {
            this.model = "DEFAULT";
        } else {
            this.model = model;
        }

        this.productionYear = productionYear;


        if (iisNullOrEmpty(productionCountry)) {
            this.productionCountry = "DEFAULT";
        } else {
            this.productionCountry = color;
        }

        if (iisNullOrEmpty(color)) {
            this.color = "DEFAULT";
        } else {
            this.color = color;
        }


        this.maxSpeed = maxSpeed;
    }


    /***** TRANSPORT методы ****/
    public static boolean iisNullOrEmpty(String value) {
        return value == null || value.isBlank();
    }
    public abstract void refill();


    /***** TRANSPORT геттеры и сеттеры ****/
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
