package observer;

public class ObserverTest {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();

        Observer o1 = new ConcreteObserver("Bill");
        Observer o2 = new ConcreteObserver("Jason");
        Observer o3 = new ConcreteObserver("Tom");

        subject.attach(o1);
        subject.attach(o2);
        subject.attach(o3);

        subject.notifyObservers("Information change");
    }
}
