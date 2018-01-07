package Factory.SimpleFactory;

public class ChicagoCheesePiza extends Pizza{
    public ChicagoCheesePiza(String name){
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
