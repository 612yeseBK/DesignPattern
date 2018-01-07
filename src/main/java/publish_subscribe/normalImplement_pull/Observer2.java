package publish_subscribe.normalImplement_pull;


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
    public void update(String info, String fro) {
        this.fro = fro;
        this.info = info;
        display();
    }


    @Override
    public void display() {
        System.out.println(this.name+",收到一个消息："+this.info+"，该消息从"+this.fro+"来");
    }
}
