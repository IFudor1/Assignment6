package Abstract.Factory;

public class ArtCoffeeTable implements CoffeeTable{
    @Override
    public void hasCoffee() {
        System.out.println("Art Coffee Table has a lot of coffee");
    }

    @Override
    public void hasCup() {
        System.out.println("Art Coffee Table has  5 cups");

    }
}
