package Factory.module;

public class Ship implements Transport {

    @Override
    public void deliver() {
        System.out.println("Delivered with Ship");
    }
}
