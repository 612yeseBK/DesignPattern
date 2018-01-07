package Decorateor;

// 基态类，最底层的真实的浓缩咖啡
public class EspressoBeverage extends Beverage {
    public EspressoBeverage(){
        description = "EspressoBeverage";
    }

    public double cost() {
        return 1.99;
    }
}
