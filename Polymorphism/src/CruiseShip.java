public class CruiseShip extends Ship{
    public int maxCapacity;

    public CruiseShip(int maxCapacity, String shipName, String yearBuilt) {
        super(shipName, yearBuilt);
        this.maxCapacity = maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity){
        this.maxCapacity = maxCapacity;
    }

    public int getMaxCapacity(){
        return maxCapacity;
    }

    @Override
    public void shipInfo(){
        System.out.println("Ship Name: " + getShipName());
        System.out.println("Maximum Capacity: " + getMaxCapacity());
    }

}
