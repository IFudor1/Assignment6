package Abstract.Factory;

public class ModernChair implements Chair{
    @Override
    public void haslegs() {
        System.out.println("Modern Chair has not legs");
    }

    @Override
    public void sitOn() {
        System.out.println("Someone sit in Modern chair");
    }
}
