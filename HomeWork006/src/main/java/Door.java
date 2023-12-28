public class Door {
    Boolean isAutomobile;

    @Override
    public String toString() {
        if (isAutomobile) return "Automobile";
        return "free";
    }

    public Door() {
        this.isAutomobile = false;
    }

    public Boolean getAutomobile() {
        return isAutomobile;
    }

    public void setAutomobile(Boolean automobile) {
        isAutomobile = automobile;
    }
}
