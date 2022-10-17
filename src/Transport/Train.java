package Transport;

public class Train extends Transport{
    private double cost;
    private double time;
    private String departureStation;
    private String lastStop;
    private int wagonAmount;


    /***** TRAIN конструкторы ****/

    public Train(String brand,
                 String model,
                 int productionYear,
                 String productionCountry,
                 String color,
                 double maxSpeed,
                 double cost,
                 double time,
                 String departureStation,
                 String lastStop,
                 int wagonAmount) {
        super(brand, model, productionYear, productionCountry, maxSpeed);

        if (cost <= 0){
            this.cost  = 1;
        } else this.cost = cost;

        if (time <= 0){
            this.time  = 1;
        } else this.time = time;

        if (iisNullOrEmpty(departureStation)) {
            this.departureStation = "<DEFAULT>";
        } else {
            this.departureStation = departureStation;
        }

        if (iisNullOrEmpty(lastStop)) {
            this.lastStop = "<DEFAULT>";
        } else {
            this.lastStop = lastStop;
        }

        if (wagonAmount <= 0){
            this.wagonAmount  = 1;
        } else this.wagonAmount = wagonAmount;

        System.out.println();
        System.out.println(
                "Train: " + getBrand() + " " + getModel() + "; \n"
                        + "Production year: " + getProductionYear() + ". \n"
                        + "Production country: " + getProductionCountry() + ". \n"
                        + "Departure station: " + getDepartureStation() + ". \n"
                        + "Last stop: " + getLastStop() + ". \n"
                        + "Maximum travel speed: " + getMaxSpeed() + " км/час. \n"
                        + "Trip price: " + getCost() + ". \n"
                        + "Wagon amount: " + getWagonAmount() + " psc. \n"
        );
    }


    /***** TRAIN методы ****/
    @Override
    public void refill() {
        System.out.println("REFILL: заправить топливом дизель");
    }

    /***** TRAIN геттеры и сеттеры ****/

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = departureStation;
    }

    public String getLastStop() {
        return lastStop;
    }

    public void setLastStop(String lastStop) {
        this.lastStop = lastStop;
    }

    public int getWagonAmount() {
        return wagonAmount;
    }

    public void setWagonAmount(int wagonAmount) {
        this.wagonAmount = wagonAmount;
    }
}
