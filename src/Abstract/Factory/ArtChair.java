package Abstract.Factory;

public class ArtChair implements Chair{
    @Override
    public void haslegs() {
        System.out.println("Art Chair has 4 legs");
    }

    @Override
    public void sitOn() {
    System.out.println("Someone sit in Art Chair");
    }
}
