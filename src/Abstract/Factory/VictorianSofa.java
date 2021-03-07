package Abstract.Factory;

public class VictorianSofa implements Sofa {
    @Override
    public void hasLegs() {
        System.out.println("Victorian Sofa has 4 legs");
    }

    @Override
    public void setOn() {
        System.out.println("A lot of people sit in Victorian Sofa");
    }

    @Override
    public void hasSeats() {
        System.out.println("Victorian has free sits");
    }

    @Override
    public void lieOn() {
        System.out.println("Somebody lie on Victorian Sofa");
    }
}
