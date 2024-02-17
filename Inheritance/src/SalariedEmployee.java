public class SalariedEmployee extends Employee {
    public int weeklySalary;

    public SalariedEmployee(int weeklySalary, String firstName, String lastName, String SSN){
        super(firstName, lastName, SSN);
        this.weeklySalary = weeklySalary;
    }

    public void setWeeklySalary(int weeklySalary)
    {
        this.weeklySalary = weeklySalary;
    }

    public int getWeeklySalary()
    {
        return weeklySalary;
    }
}
