package Transport;

import java.time.LocalDate;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private int productionYear;
    private final String productionCountry;

    private String transmission; //коробка
    private final String bodyType;
    private String regNumber;
    private int numberOfSeats;
    private boolean summerTyres;
    private Key key;
    private Insurance insurance;

    /***** CLASS KEY ВЛОЖЕННЫЙ ****/
    public static class Key {
        private final boolean remoteStartEngine;
        private final boolean keylessAccess;

        public Key(boolean remoteStartEngine, boolean keylessAccess) {
            this.remoteStartEngine = remoteStartEngine;
            this.keylessAccess = keylessAccess;
        }

        public Key() {
            this(false, false);
        }

        public boolean isRemoteStartEngine() {
            return remoteStartEngine;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }

    /***** CLASS INSURANCE ВЛОЖЕННЫЙ ****/
    public static class Insurance {
        private final LocalDate expireDate;
        private final double cost;
        private final String insuranceNumber;

        public Insurance(LocalDate expireDate, double cost, String insuranceNumber) {
            if (expireDate == null) {
                this.expireDate = LocalDate.now().plusDays(365);
            } else {
                this.expireDate = expireDate;
            }
            this.cost = cost;
            if (insuranceNumber == null) {
                this.insuranceNumber = "123456789";
            } else {
                this.insuranceNumber = insuranceNumber;
            }
        }

        public Insurance() {
            this(null, 2100, null);
        }

        public LocalDate getExpireDate() {
            return expireDate;
        }

        public double getCost() {
            return cost;
        }

        public String getInsuranceNumber() {
            return insuranceNumber;
        }

        public void checkExpireDate() {
            if (expireDate.isBefore(LocalDate.now()) || expireDate.isEqual(LocalDate.now())) {
                System.out.println("Нужно срочно ехать оформлять новую страховку");
            }
        }

        public void checkInsuranceNumber() {
            if (insuranceNumber.length() != 9) {
                System.out.println("Номер страховки некорректный!");
            }
        }
    }


    /***** CAR КОНСТРУКТОРЫ ****/
    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int productionYear,
               String productionCountry,
               String transmission,
               String bodyType,
               String regNumber,
               int numberOfSeats,
               boolean summerTyres,
               Key key,
               Insurance insurance) {

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

        this.engineVolume = 1.5;

        if (iisNullOrEmpty(color)) {
            this.color = "DEFAULT";
        } else {
            this.color = color;
        }

        this.productionYear = productionYear;

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
        }

        if (iisNullOrEmpty(transmission)) {
            this.transmission = "DEFAULT";
        } else {
            this.transmission = transmission;
        }

        if (iisNullOrEmpty(regNumber)) {
            this.regNumber = "x000x000";
        } else {
            this.regNumber = regNumber;
        }

        this.numberOfSeats = numberOfSeats;

        this.summerTyres = summerTyres;

        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }

        System.out.println();
        System.out.println(
                "Автомобиль: " + getBrand() + " " + getModel() + "; \n"
                        + "год выпуска: " + getProductionYear() + "; \n"
                        + "страна сборки: " + getProductionCountry() + "; \n"
                        + "тип кузова: " + getBodyType() + "; \n"
                        + "цвет кузова: " + getColor() + "; \n"
                        + "коробка передач: " + getTransmission() + "; \n"
                        + "объем двигателя: " + getEngineVolume() + " литра; \n"
                        + "регистрационный номер: " + getRegNumber() + "; \n"
                        + "количество мест " + getNumberOfSeats() + "; \n"
                        + (isSummerTyres() ? "летняя" : "зимняя") + " резина; \n"
        );
    }


    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int productionYear,
               String productionCountry) {

        this(
                brand,
                model,
                engineVolume,
                color,
                productionYear,
                productionCountry,
                "DEFAULT",
                "DEFAULT",
                "x000xx000",
                5,
                true,
                new Key(),
                new Insurance()
        );


        System.out.println();
        System.out.println(
                "Автомобиль: " + getBrand() + " " + getModel() + "; \n"
                        + "год выпуска: " + getProductionYear() + "; \n"
                        + "страна сборки: " + getProductionCountry() + "; \n"
                        + "тип кузова: " + getBodyType() + "; \n"
                        + "цвет кузова: " + getColor() + "; \n"
                        + "коробка передач: " + getTransmission() + "; \n"
                        + "объем двигателя: " + getEngineVolume() + " литра; \n"
                        + "регистрационный номер: " + getRegNumber() + "; \n"
                        + "количество мест " + getNumberOfSeats() + "; \n"
                        + (getKey().isKeylessAccess() ? "бесключевой доступ" : "ключевой доступ") + "; \n"
                        + (getKey().isRemoteStartEngine() ? "удаленный запуск двигателя есть" : "удаленный запуск двигателя отсутствует") + "; \n"
                        + "номер страховки: " + getInsurance().getInsuranceNumber() + "; \n"
                        + "стоимость страховки: " + getInsurance().getCost() + "; \n"
                        + "срок действия: " + getInsurance().getExpireDate()
        );
    }


    /***** CAR МЕТОДЫ ****/
    public static boolean iisNullOrEmpty(String value) {
        return value == null || value.isBlank();
    }

    public void changeTyres() {
        this.summerTyres = !this.summerTyres; // метод инвертирования. Если summerTyres были true - меняем на false и наоборот
    }

    public boolean checkRegNumber() {
        if (regNumber.matches("[A-Z]\\d{3}[A-Z]{2}\\d{3}")) { //x000xx000
            this.regNumber = regNumber;
            return true;
        } else if (regNumber.matches("[A-Z]\\d{3}[A-Z]{2}\\d{2}")) { //x000xx00
            this.regNumber = regNumber;
            return true;
        } else {
            this.regNumber = "Неверный формат номера";
            return false;
        }
    }

    /***** CAR ГЕТТЕРЫ И СЕТТЕРЫ ****/
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
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

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null) {
            this.transmission = "DEFAULT";
        }
        this.transmission = transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        if (regNumber == null) {
            this.regNumber = "x000xx000";
        }
        this.regNumber = regNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public boolean isSummerTyres() {
        return summerTyres;
    }

    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
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



