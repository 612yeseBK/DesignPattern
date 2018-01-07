package Factory.AbstractFactory;

public class NYKCheesePizza extends Pizza {
    public NYKCheesePizza(){
        name = "NYK style and cheese type";
        sauce = "nykcheese sauce";
    }
    void bake(){
        System.out.println("newYork式起司烘焙");
    }

}
