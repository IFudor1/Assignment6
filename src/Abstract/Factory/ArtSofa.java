package Abstract.Factory;

public class ArtSofa implements Sofa{
    @Override
    public void hasLegs() {
        System.out.println("Art Sofa has 4 legs");
    }

    @Override
    public void setOn() {
     System.out.println("A lot of people sit in Art Sofa");
    }

    @Override
    public void hasSeats() {
     System.out.println("ArtSofa has free sits");
    }

    @Override
    public void lieOn() {
       System.out.println("Somebody lie on Sofa");
    }
}
