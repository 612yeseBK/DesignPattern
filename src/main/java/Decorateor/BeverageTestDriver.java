package Decorateor;

public class BeverageTestDriver {
    public static void main(String[] args){
        Beverage beverage = new MochaDecorator(new EspressoBeverage());
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
    }
}
