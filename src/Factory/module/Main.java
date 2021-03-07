package Factory.module;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();

        Transport ship = factory.getTransport(Transports.ship);
        ship.deliver();

        Transport truck = factory.getTransport(Transports.truck);
        truck.deliver();
    }
}
