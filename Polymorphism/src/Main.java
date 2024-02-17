public class Main {
    public static void main(String args[]){
        Ship ship1 = new Ship("Ship One", "1999");
        Ship ship2 = new CruiseShip(10000, "Ship Two", "2005");
        Ship ship3 = new CargoShip(500, "Ship Three", "2007");

        Ship[] shipArray = new Ship[]{ship1, ship2, ship3};

        for (int i = 0; i < 3; i++)
        {
            shipArray[i].shipInfo();
            System.out.println();
        }
    }
}
