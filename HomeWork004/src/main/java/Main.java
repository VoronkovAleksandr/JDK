import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Employers team = new Employers();
        team.add("1", "Рабочий 1", LocalDate.of (2005, 5, 12));
        team.add("2", "Рабочий 2", LocalDate.of(2010, 5, 12));
        team.add("3", "Рабочий 3", LocalDate.of(2015, 5, 12));
        team.add("4", "Рабочий 4", LocalDate.of(2015, 5, 12));


        System.out.println(team.findEmployerByExperience(8));
        System.out.println(team.findPersonById(2));
        System.out.println(team.findPhoneByName("Рабочий 3"));

    }

}
