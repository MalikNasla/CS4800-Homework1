import java.sql.SQLOutput;

public class Ship {
    public String shipName;
    public String yearBuilt;

    public Ship(String shipName, String yearBuilt){
        this.shipName = shipName;
        this.yearBuilt = yearBuilt;
    }

    public void setShipName(String shipName){
        this.shipName = shipName;
    }
    public void setYearBuilt(String yearBuilt){
        this.yearBuilt = yearBuilt;
    }

    public String getShipName(){
        return shipName;
    }

    public String getYearBuilt(){
        return yearBuilt;
    }

    public void shipInfo(){
        System.out.println("Ship Name: " + getShipName());
        System.out.println("Year Built: " + getYearBuilt());
    }

}
