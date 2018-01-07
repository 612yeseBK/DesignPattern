package publish_subscribe.normalImplement_push;


public class Observer1 implements Observer, Display {
    private InfoProvider infoProvider;
    private String fro;
    private String info;
    private String name;

    public Observer1(String name,InfoProvider infoProvider){
        this.infoProvider = infoProvider;
        this.name = name;
        this.infoProvider.register(this);
    }
    @Override
    public void update() {
        this.fro = this.infoProvider.getFro();
        this.info = this.infoProvider.getInfo();
        display();
    }


    @Override
    public void display() {
        System.out.println(this.name+"，从"+this.fro+"那里收到消息，消息是："+this.info);
    }
}
