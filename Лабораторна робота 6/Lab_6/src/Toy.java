public class Toy implements Item
{
    private double volume;
    private String name;
    private double price;

    public Toy(double volume, String name, double price) {
        this.volume = volume;
        this.name = name;
        this.price = price;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getVolume()
    {
        return volume;
    }

    @Override
    public void PrintInfo()
    {
        System.out.println("Toy: volume - " + volume + "; name - " + name + "; price - " + price + ";");
    }
}
