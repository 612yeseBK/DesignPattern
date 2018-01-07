package Factory.SimpleFactory;

public class NYKCheesePiza extends Pizza{
    public NYKCheesePiza(String name){
        this.setName(name);
    }
    public void printName() {
        System.out.println(this.getClass().getName() + ":" + this.getName());
    }

    public void doSomething01() {

    }

    public void doSomething02() {

    }

    public void doSomething03() {

    }
}
