package publish_subscribe.normalImplement_push;


import java.util.ArrayList;

public class InfoProvider implements Subject {

    private String info;



    private String fro;
    private ArrayList<Observer> observers = new ArrayList<Observer>();

    public String getInfo() {
        return info;
    }

    public String getFro() {
        return fro;
    }

    public void setInformation(String fro, String info){
        this.info = info;
        this.fro = fro;
        this.notifyA();
    }
    //    public InfoProvider(){
//        this.observers = new ArrayList<Observer>();
//    }
    @Override
    public void register(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyA() {
        for (Observer observer : observers){
            observer.update();
        }

    }
}
