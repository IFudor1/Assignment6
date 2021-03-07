package Factory.module;

public class Truck  implements Transport{

    @Override
    public void deliver() {
        System.out.println("Delivered with Truck");
    }
}
