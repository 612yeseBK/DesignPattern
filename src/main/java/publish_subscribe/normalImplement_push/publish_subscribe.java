package publish_subscribe.normalImplement_push;

public class publish_subscribe {
    public static void main(String[] args){
    InfoProvider infoProvider = new InfoProvider();
    new Observer1("一号观察者",infoProvider);
    new Observer2("二号观察者",infoProvider);
    infoProvider.setInformation("被观察者infoProvider","消息1");

    }

}
