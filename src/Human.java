import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

public class Human {

    String name;
    private String cityOfResidence;
    private String job;
    private Integer yearOfBirth;
    //private Integer age;

    /*** NAME ***/
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            this.name = "<Информация не указана>";
        }
    }
    /*** JOB ***/
    public void setJob(String job) {
        //this.job = job;
        if (job != null && !job.isEmpty() && !job.isBlank()) {
            this.job = job;
        } else {
            this.job = "<Информация не указана>";
        }
    }
    public String getJob() {
        return job;
    }

    /*** AGE ***/
        public void setAge(Integer age) {
        if (age >= 0 && age != null) {
            this.yearOfBirth = LocalDate.now().getYear() - age;
        } else {
            this.yearOfBirth = LocalDate.now().getYear();
        }
        }
        public int getAge () {
            return LocalDate.now().getYear() - yearOfBirth;
        }

        /*** CITY OF RESIDENCE ***/
        public void setCityOfResidence(String cityOfResidence){
            if (cityOfResidence != null && !cityOfResidence.isEmpty() && !cityOfResidence.isBlank()) {
                this.cityOfResidence = cityOfResidence;
            } else {
                this.cityOfResidence = "<Информация не указана>";
            }
        }
        public String getCityOfResidence () {
                return cityOfResidence;
            }


        /*** КОНСТРУКТОР ***/
        Human(Integer age){
            this(age, "<Информация не указана>", "<Информация не указана>", "<Информация не указана>");
        }

        Human(Integer age, String name, String cityOfResidence, String job){
            this.setName(name);
            this.setCityOfResidence(cityOfResidence);
            this.setJob(job);
            this.setAge(age);
            System.out.println("Привет! Меня зовут " + getName() + ". Я из города " + getCityOfResidence() + ". Мне " + getAge() + " лет (год). " +
                    "Я родился (родилась) в " + yearOfBirth + " году. Я работаю в должности " + getJob() + ". Будем знакомы!");
        }
    }