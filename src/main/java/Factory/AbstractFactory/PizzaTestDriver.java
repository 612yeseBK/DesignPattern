package Factory.AbstractFactory;

public class PizzaTestDriver {
    public static void main(String[] args){
        Pizza pizza =null;
        PizzaStore nykPizzaStore = new NYKPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        try {
            pizza = nykPizzaStore.orderPizza("Cheese");
            System.out.println("Jason 订了一份"+pizza.getName());
            pizza = chicagoPizzaStore.orderPizza("Chicken");
            System.out.println("Jason 又订了一份"+pizza.getName());
        } catch (PizzaException e) {
            e.printStackTrace();
        }

    }
}
