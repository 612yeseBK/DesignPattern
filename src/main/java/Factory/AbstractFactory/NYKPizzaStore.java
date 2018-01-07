package Factory.AbstractFactory;

public class NYKPizzaStore extends PizzaStore{
    public Pizza creatPizza(String type) throws PizzaException{
        if (type.equals("Cheese")){
            return new NYKCheesePizza();
        } else if (type.equals("Chicken")){
            return new NYKChickenPizza();
        } else throw new PizzaException("没有该种风味");
    }
}
