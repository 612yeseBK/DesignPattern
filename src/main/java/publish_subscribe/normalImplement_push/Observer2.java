package publish_subscribe.normalImplement_push;


public class Observer2 implements Observer, Display {
    private InfoProvider infoProvider;
    private String fro;
    private String info;
    private String name;

    public Observer2(String name,InfoProvider infoProvider){
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
        System.out.println(this.name+",收到一个消息："+this.info+"，该消息从"+this.fro+"来");
    }
}
