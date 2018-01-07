package publish_subscribe.normalImplement_pull;

public interface Subject {
    void register(Observer observer);

    void remove(Observer observer);

    void notifyA();
}
