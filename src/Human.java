import org.w3c.dom.ls.LSOutput;

public class Human {
    String name;
    int yearOfBirth;
    String cityOfResidence;
    String position;

    void hello() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + cityOfResidence + ". Я родился (родилась) в " +
                yearOfBirth + " году. Я работаю в должности " + position + ". Будем знакомы!");
    }

}
