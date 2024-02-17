public class CargoShip extends Ship{
    public int tonnage;

    public CargoShip(int tonnage, String shipName, String yearBuilt){
        super(shipName, yearBuilt);
        this.tonnage = tonnage;
    }

    public void setTonnage(int tonnage){
        this.tonnage = tonnage;
    }

    public int getTonnage(){
        return tonnage;
    }

    @Override
    public void shipInfo(){
        System.out.println("Ship Name: " + getShipName());
        System.out.println("Cargo Capacity: " + getTonnage());
    }
}
