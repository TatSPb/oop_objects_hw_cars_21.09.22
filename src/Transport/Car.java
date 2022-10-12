package Transport;

public class Car {
    private final String brand;
    private final String model;
    double engineVolume;
    String color;
    private int productionYear;
    private final String productionCountry;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private int numberOfSeats;
    private boolean summerTyres;


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

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public boolean isSummerTyres() {
        return summerTyres;
    }

    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }

    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int productionYear,
               String productionCountry,
               String transmission,
               String bodyType,
               String registrationNumber,
               int numberOfSeats,
               boolean summerTyres) {

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

        if (engineVolume == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (iisNullOrEmpty(color)) {
            this.color = "DEFAULT";
        } else {
            this.color = color;
        }

        if (productionYear == 0) {
            productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }

        if (iisNullOrEmpty(productionCountry)) {
            this.productionCountry = "DEFAULT";
        } else {
            this.productionCountry = color;
        }

        if (iisNullOrEmpty(transmission)) {
            this.transmission = "DEFAULT";
        } else {
            this.transmission = transmission;
        }


        if (iisNullOrEmpty(bodyType)) {
            this.bodyType = "DEFAULT";
        } else {
            this.bodyType = bodyType;
            ;
        }

        if (iisNullOrEmpty(transmission)) {
            this.transmission = "DEFAULT";
        } else {
            this.transmission = transmission;
        }

        if (iisNullOrEmpty(registrationNumber)) {
            this.registrationNumber = "DEFAULT";
        } else {
            this.registrationNumber = registrationNumber;
        }


        if (numberOfSeats == 0) {
            numberOfSeats = 5;
        } else {
            this.numberOfSeats = numberOfSeats;
        }

        this.summerTyres = summerTyres;
        System.out.println();
        System.out.println(brand + " " + model + ", " + productionYear + " год выпуска, страна сборки " + productionCountry
                + ", \n тип кузова " + bodyType + ", цвет кузова " + color + ", "
                + "\n коробка передач " + transmission + ", объем двигателя - " + engineVolume + " литра, " +
                "\n регистрационный номер" + registrationNumber + ", количество мест " + numberOfSeats + ", "
                + summerTyres + " резина.");
    }

    public static boolean iisNullOrEmpty(String value) {
        return value == null || value.isBlank();
    }

    public void changeTyres() {
        this.summerTyres = !this.summerTyres; // метод инвертирования. Если summerTyres были true - меняем на false и наоборот
    }

    public boolean checkRegistrationNumber() {
        if (registrationNumber.matches("[A-Z]\\d{3}[A-Z]{2}\\d{3}")) { //x000xx000
            this.registrationNumber = registrationNumber;
            return true;
        } else if (registrationNumber.matches("[A-Z]\\d{3}[A-Z]{2}\\d{2}")) { //x000xx00
            this.registrationNumber = registrationNumber;
            return true;
        } else {
            this.registrationNumber = "Неверный формат номера";
            return false;
        }
    }

//        if (registrationNumber.length() < 9) {
//            System.out.println("Некорректный регистрационный номер");
//            return false;
//        }
//        char[] registrationNumber = this.registrationNumber.toCharArray();
//        if (!Character.isAlphabetic(registrationNumber[0])) { //инверсия на является ли первый символ символом алфавита
//            System.out.println("Некорректный регистрационный номер");
//            return false;
//        }
//        if (!Character.isAlphabetic(registrationNumber[4])) {
//            System.out.println("Некорректный регистрационный номер");
//            return false;
//        }
//        if (!Character.isAlphabetic(registrationNumber[5])) {
//            System.out.println("Некорректный регистрационный номер");
//            return false;
//        }
//
//        if (!Character.isDigit(registrationNumber[1])) {
//            System.out.println("Некорректный регистрационный номер");
//            return false;
//        }
//
//        if (!Character.isDigit(registrationNumber[2])) {
//            System.out.println("Некорректный регистрационный номер");
//            return false;
//        }
//
//        if (!Character.isDigit(registrationNumber[3])) {
//            System.out.println("Некорректный регистрационный номер");
//            return false;
//        }
//        if (!Character.isDigit(registrationNumber[6])) {
//            System.out.println("Некорректный регистрационный номер");
//            return false;
//        }
//        if (!Character.isDigit(registrationNumber[7])) {
//            System.out.println("Некорректный регистрационный номер");
//            return false;
//        }
//        if (!Character.isDigit(registrationNumber[8])) {
//            System.out.println("Некорректный регистрационный номер");
//            return false;
//        }
//        return true;


}
