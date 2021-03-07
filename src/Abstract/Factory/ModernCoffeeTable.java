package Abstract.Factory;

public class ModernCoffeeTable implements CoffeeTable{
    @Override
    public void hasCoffee() {
        System.out.println("Modern Coffee Table has a lot of coffee");
    }

    @Override
    public void hasCup() {
        System.out.println("Modern Coffee Table has  5 cups");
    }
}
