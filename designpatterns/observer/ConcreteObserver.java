package observer;

public class ConcreteObserver implements Observer {

    String name;

    public ConcreteObserver(String name){
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println(name + "收到消息" + msg);
    }
}
