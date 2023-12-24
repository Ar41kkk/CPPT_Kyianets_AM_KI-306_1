public class Clothes implements Item
{
    private double volume;
    private String typeOfClothes;
    private String size;

    public Clothes(double volume, String typeOfClothes, String size)
    {
        this.volume = volume;
        this.typeOfClothes = typeOfClothes;
        this.size = size;
    }

    public void setVolume(double volume)
    {
        this.volume = volume;
    }

    public String getTypeOfClothes()
    {
        return typeOfClothes;
    }

    public void setTypeOfClothes(String typeOfClothes)
    {
        this.typeOfClothes = typeOfClothes;
    }

    public String getSize()
    {
        return size;
    }

    public void setSize(String size)
    {
        this.size = size;
    }

    @Override
    public double getVolume()
    {
        return volume;
    }

    @Override
    public void PrintInfo()
    {
        System.out.println("Clothes: volume - " + volume + "; type of clothes - " + typeOfClothes + "; size - " + size + ";");
    }
}
