package Decorateor;

// 基态类，另一种饮料
public class HouseBlendBeverage extends Beverage {
    public HouseBlendBeverage(){
        description = "HouseBlendBeverage";
    }

    public double cost() {
        return 2.99;
    }
}
