package Factory.SimpleFactory;

public class PizzaStore {
    SimpleFactory simpleFactory;
    Pizza pizza;
    public PizzaStore(SimpleFactory simpleFactory){
        this.simpleFactory = simpleFactory;
    }
    public Pizza orderPizza(String style,String type) throws Exception{
        pizza = simpleFactory.creatPizza(style,type);
        return pizza;
    }

    public static void main(String[] args){
        SimpleFactory simpleFactory = new SimpleFactory();
        PizzaStore pizzaStore = new PizzaStore(simpleFactory);
        Pizza pizza = null;
        try {
            pizza = pizzaStore.orderPizza("NYK","Cheese");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (pizza!=null) {
            pizza.printName();
        }
    }
}
