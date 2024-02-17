public class ComissionEmployee extends Employee{

    public double commisionRate;
    public int grossSales;

    public ComissionEmployee(double commisionRate, int grossSales, String firstName, String lastName, String SSN){
        super(firstName, lastName, SSN);
        this.commisionRate = commisionRate;
        this.grossSales = grossSales;
    }

    public void setCommisionRate(double commisionRate){
        this.commisionRate = commisionRate;
    }

    public void setGrossSales(int grossSales){
        this.grossSales = grossSales;
    }

    public double getCommisionRate(){
        return commisionRate;
    }

    public int getGrossSales(){
        return grossSales;
    }

}
