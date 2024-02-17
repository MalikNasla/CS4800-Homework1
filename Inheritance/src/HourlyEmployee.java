public class HourlyEmployee extends Employee{
    public int wage;
    public int hoursWorked;

    public HourlyEmployee(int wage, int hoursWorked, String firstName, String lastName, String SSN){
        super(firstName, lastName, SSN);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    public void setWage(int wage){
        this.wage = wage;
    }

    public void setHoursWorked(int hoursWorked){
        this.hoursWorked = hoursWorked;
    }

    public int getWage(){
        return wage;
    }

    public int hoursWorked(){
        return hoursWorked;
    }
}
