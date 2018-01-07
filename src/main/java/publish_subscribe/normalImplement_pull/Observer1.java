package publish_subscribe.normalImplement_pull;


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
    public void update(String info, String fro) {
        this.fro = fro;
        this.info = info;
        display();
    }


    @Override
    public void display() {
        System.out.println(this.name+"，从"+this.fro+"那里收到消息，消息是："+this.info);
    }
}
