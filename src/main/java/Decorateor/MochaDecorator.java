package Decorateor;

public class MochaDecorator extends Decorator{

    Beverage beverage;

    public MochaDecorator(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription()+",Mocha";
    }

    public double cost() {
        return 2.98+beverage.cost();
    }
}
