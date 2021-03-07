package Abstract.Factory;

public class VictorianChair implements Chair {
    @Override
    public void haslegs() {
        System.out.println("Victorian Chair has 4 legs");
    }

    @Override
    public void sitOn() {
        System.out.println("Someone sit in Victorian chair");
    }
}
