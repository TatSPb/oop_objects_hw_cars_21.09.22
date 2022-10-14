package Transport;

public class Bus extends Transport{

    public Bus(String brand) {
        super(brand);
    }

    public Bus(String brand, String model, int productionYear, String productionCountry, double maxSpeed, String color) {
        super(brand, model, productionYear, productionCountry, maxSpeed, color);

        System.out.println(
                "Bus: " + getBrand() + " " + getModel() + "; \n"
                        + "Production year: " + getProductionYear() + ". \n"
                        + "Production country: " + getProductionCountry() + ". \n"
                        + "Maximum travel speed: " + getMaxSpeed() + " км/час. \n"
                        + "Bus color: " + getColor() + ". \n"
        );
    }
}
