package Factory.AbstractFactory;

public abstract class PizzaStore {
    public Pizza orderPizza(String type) throws PizzaException{
        Pizza pizza;
        pizza = creatPizza(type);
        pizza.prepare();
        pizza.cut();
        pizza.bake();
        pizza.box();
        return pizza;
    }
    public abstract Pizza creatPizza(String type) throws PizzaException;
}
