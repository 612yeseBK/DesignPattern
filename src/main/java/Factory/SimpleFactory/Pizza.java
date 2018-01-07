package Factory.SimpleFactory;

public abstract class Pizza {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void printName();

    public abstract void doSomething01();
    public abstract void doSomething02();
    public abstract void doSomething03();
}
