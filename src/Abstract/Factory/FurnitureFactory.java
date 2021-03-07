package Abstract.Factory;

public interface FurnitureFactory {
    public Chair CreateChair();
    public Sofa CreateSofa();
    public CoffeeTable CreateCoffeeTable();
}
