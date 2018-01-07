package Factory.AbstractFactory;

public class ChicagoCheesePizza extends Pizza {
    public ChicagoCheesePizza(){
        name = "Chicago style and cheese type";
        sauce = "Chicago cheese sauce";
    }
    void bake(){
        System.out.println("Chicago式起司烘焙");
    }

}
