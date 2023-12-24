public class Main {
    public static void main(String[] args)
    {

        Box<? super Item> box = new Box<>();

        box.AddItem(new Clothes(29, "Sweeter", "M"));
        box.AddItem(new Clothes(32, "Hoodie", "XL"));
        box.AddItem(new Toy(65, "Dino", 560));
        box.AddItem(new Toy(40, "Cat", 100));
        box.AddItem(new Clothes(21, "T-Shirt", "L"));
        box.AddItem(new Toy(15, "Tom", 600));
        box.AddItem(new Clothes(45, "Hoodie", "L"));

        var min=  box.FindMin();
        System.out.print("\nMin element is: ");
        min.PrintInfo();
    }
}