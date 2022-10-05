import org.w3c.dom.ls.LSOutput;

public class Human {
    String name;
    int yearOfBirth;
    String cityOfResidence;
    String job;

    Human(int yearOfBirth) {
        this(yearOfBirth, "<Информация не указана>", "<Информация не указана>", "<Информация не указана>");
    }

    Human(int yearOfBirth, String name, String cityOfResidence, String job) {
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            yearOfBirth = Math.abs(yearOfBirth);
        }
        this.name = name;
        this.cityOfResidence = cityOfResidence;
        this.job = job;
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + cityOfResidence + ". Я родился (родилась) в "
                + yearOfBirth + " году. Я работаю в должности " + job + ". Будем знакомы!");
    }
}