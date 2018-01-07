package publish_subscribe.normalImplement_pull;


// 观察者，或者成为数据接收方，用以接收并展示数据，update就是display的意思
public interface Observer {
    // 被观察者（主题）调用update方法，将自己的参数push给观察者
    public void update(String info,String fro);
}
