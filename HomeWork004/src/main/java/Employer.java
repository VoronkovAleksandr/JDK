import java.time.LocalDate;
import java.time.Period;


public class Employer {
    private Integer id;
    private String phone;
    private String name;
    private LocalDate dateStartWorking;

    public Employer(Integer id, String phone, String name, LocalDate dateStartWorking) {
        this.id = id;
        this.phone = phone;
        this.name = name;
        this.dateStartWorking = dateStartWorking;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateStartWorking(LocalDate dateStartWorking) {
        this.dateStartWorking = dateStartWorking;
    }

    public Integer getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateStartWorking() {
        return dateStartWorking;
    }

    public Integer getExperience() {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(dateStartWorking, currentDate);
        return period.getYears();
    }
}
