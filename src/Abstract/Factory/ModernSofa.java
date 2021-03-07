package Abstract.Factory;

public class ModernSofa implements Sofa{
    @Override
    public void hasLegs() {
        System.out.println("Modern Sofa has 4 legs");
    }

    @Override
    public void setOn() {
        System.out.println("A lot of people sit in Modern Sofa");
    }

    @Override
    public void hasSeats() {
        System.out.println("Modern has free sits");
    }

    @Override
    public void lieOn() {
        System.out.println("Somebody lie on Modern Sofa");
    }
}
