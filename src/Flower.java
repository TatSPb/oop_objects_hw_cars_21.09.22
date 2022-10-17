public class Flower {
    private String flowerName;
    private String flowerColor;
    private String flowerCountry;
    private double flowerCost;
    private int lifeSpan;

    Flower(String flowerName, String flowerColor, String flowerCountry, double flowerCost, int lifeSpan) {
        this.flowerName = flowerName;

        if (iisNullOrEmpty(flowerColor)) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
        if (iisNullOrEmpty(flowerCountry)) {
            this.flowerCountry = "Россия";
        } else {
            this.flowerCountry = flowerCountry;
        }
        if (flowerCost <= 0) {
            this.flowerCost = 1;
        } else {
            this.flowerCost = flowerCost;
        }
        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }

        System.out.println(getFlowerName() + " " + getFlowerColor() + " из " + getFlowerCountry() + ", стоимость штуки - " + flowerCost +
                " рублей, срок стояния - " + getLifeSpan() + " дней.");

    }

    public String getFlowerName() {
        return flowerName;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public String getFlowerCountry() {
        return flowerCountry;
    }

    public double getFlowerCost() {
        return flowerCost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    public void setFlowerCountry(String flowerCountry) {
        this.flowerCountry = flowerCountry;
    }

    public void setFlowerCost(double flowerCost) {
        this.flowerCost = flowerCost;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public static boolean iisNullOrEmpty(String value) {
        return value == null || value.isBlank();
    }
}


