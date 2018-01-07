package publish_subscribe.normalImplement_pull;


import java.util.ArrayList;

public class InfoProvider implements Subject {

    private String info;



    private String fro;
    private ArrayList<Observer> observers = new ArrayList<Observer>();


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
            // 被观察者（主题）调用update方法，将自己的参数push给观察者
            observer.update(this.info,this.fro);
        }

    }
}
