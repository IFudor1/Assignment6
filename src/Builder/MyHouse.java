package Builder;

public interface MyHouse {
    public House.HouseBuilder setAddress(String add);
    public House.HouseBuilder setVolume(int vol);
    public House.HouseBuilder setQuantityOfRooms(int b);
    public House.HouseBuilder setQuantityOfRestrooms(int b);
    public House.HouseBuilder setPrice(int q);
}
