package Factory.AbstractFactory;

public class ChicagoPizzaStore extends PizzaStore{
    public Pizza creatPizza(String type) throws PizzaException{
        if (type.equals("Cheese")){
            return new ChicagoCheesePizza();
        } else if (type.equals("Chicken")){
            return new ChicagoChickenPizza();
        } else throw new PizzaException("没有该种风味");
    }
}
