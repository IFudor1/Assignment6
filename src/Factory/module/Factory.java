package Factory.module;

public class Factory {
    public Transport getTransport(Transports transportsType) {
        if (transportsType == null) {
            return null;
        }
        if (Transports.ship == transportsType) {
            return new Ship();

        } else if (transportsType == Transports.truck) {
            return new Truck();

        }
        return null;
    }
}
