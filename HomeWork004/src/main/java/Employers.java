import java.time.LocalDate;
import java.util.ArrayList;


public class Employers {
    ArrayList<Employer> employers;

    public Employers() {
        employers = new ArrayList<>();
    }

    public void add(String phone, String name, LocalDate dateStartWorking) {
        employers.add(new Employer(getLastId() + 1, phone, name, dateStartWorking));
    }

    public String findPersonById(Integer id) {
        if (!employers.stream()
                .filter(employer -> employer.getId().equals(id))
                .toList()
                .isEmpty()) {
            return employers.stream()
                    .filter(employer -> employer.getId().equals(id))
                    .toList()
                    .get(0)
                    .getName();
        }
        return "Сотрудника с таким id нет";
    }

    public String findPhoneByName(String name) {
        if (!employers.stream()
                .filter(employer -> employer.getName().equals(name))
                .toList()
                .isEmpty()) {
            ArrayList<Employer> findEmployers = new ArrayList<>(employers.stream()
                    .filter(employer -> employer.getName().equals(name))
                    .toList());
            StringBuilder stringBuilder = new StringBuilder();
            for (Employer employer :
                    findEmployers) {
                if (!stringBuilder.isEmpty()){
                    stringBuilder.append("\n");
                }
                stringBuilder.append(employer.getPhone());
            }
            return stringBuilder.toString();
        }
        return "Сотрудников с таким именем нет";
    }

    public String findEmployerByExperience(Integer year) {
        if (!employers.stream()
                .filter(employer -> employer.getExperience().equals(year))
                .toList()
                .isEmpty()) {
            ArrayList<Employer> findEmployers = new ArrayList<>(employers.stream()
                    .filter(employer -> employer.getExperience().equals(year))
                    .toList());
            StringBuilder stringBuilder = new StringBuilder();
            for (Employer employer :
                    findEmployers) {
                if (!stringBuilder.isEmpty()){
                    stringBuilder.append("\n");
                }
                stringBuilder.append(employer.getName());
            }
            return stringBuilder.toString();
        }
        return "Сотрудников с таким стажем нет";
    }

    private Integer getLastId() {
        if (!employers.isEmpty()) {
            return employers.get(employers.size()-1).getId();
        }
        return 0;
    }
}
