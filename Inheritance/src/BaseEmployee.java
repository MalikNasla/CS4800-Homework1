public class BaseEmployee extends Employee{
    public int baseSalary;

    public BaseEmployee(int baseSalary, String firstName, String lastName, String SSN){
        super(firstName, lastName, SSN);
        this.baseSalary = baseSalary;
    }

    public void setBaseSalary(int baseSalary){
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary(){
        return baseSalary;
    }

}
