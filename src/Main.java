public class Main {
    public static void main(String[] args) {
        Human maksim = new Human(); //new = создать новый объект типа/класса Cat
        maksim.name = "Максим";
        maksim.yearOfBirth = 1987;
        maksim.cityOfResidence = "Минск";
        maksim.position = "бренд-менеджера";
        maksim.hello();

        Human anya = new Human(); //new = создать новый объект типа/класса Cat
        anya.name = "Аня";
        anya.yearOfBirth = 1993;
        anya.cityOfResidence = "Москва";
        anya.position = "методиста образовательных программ";
        anya.hello();

        Human katya = new Human(); //new = создать новый объект типа/класса Cat
        katya.name = "Катя";
        katya.yearOfBirth = 1994;
        katya.cityOfResidence = "Калининград";
        katya.position = "продакт-менеджера";
        katya.hello();

        Human artem = new Human(); //new = создать новый объект типа/класса Cat
        artem.name = "Артем";
        artem.yearOfBirth = 1995;
        artem.cityOfResidence = "Москва";
        artem.position = "директора по развитию бизнеса";
        artem.hello();
    }
}