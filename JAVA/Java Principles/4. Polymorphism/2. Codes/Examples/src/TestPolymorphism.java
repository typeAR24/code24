public class TestPolymorphism {

    public static void main(String[] args) {
        VWCar vwCar = new VWCar();

        System.out.println("\n-----------------------------------------------BASE VW CLASS\n");
        vwCar.carCondition();
        System.out.println("\n-----------------------------------------------AD VW CAR");
        adolphVW adolphVW = new adolphVW();
        adolphVW.carCondition();
        System.out.println("\n-----------------------------------------------CP VW CAR");
        chrispieVW chrispieVW= new chrispieVW();
        chrispieVW.carCondition();
        System.out.println("-----------------------------------------------\n");

    }
}
