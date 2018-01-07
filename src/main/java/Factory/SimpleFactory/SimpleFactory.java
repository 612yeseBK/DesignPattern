package Factory.SimpleFactory;

public class SimpleFactory {
    public Pizza creatPizza(String style,String type) throws PizzaException {
        if ("NYK".equals(style)) {
            if ("Cheese".equals(type)) {
                return new NYKCheesePiza(type);
            } else if ("Chicken".equals(type)) {
                return new NYKChickenPizza(type);
            }else throw new PizzaException("NYK没有"+type+"型pizza");
        } else if ("Chicago".equals(style)) {
            if ("Cheese".equals(type)) {
                return new ChicagoCheesePiza(type);
            } else if ("Chicken".equals(type)) {
                return new ChicagoChickenPizza(type);
            } else throw new PizzaException("Chicago没有"+type+"型pizza");
        } else throw new PizzaException("没有这种风味");
    }
}
