package observer;

public class ConcreteSubject implements Subject {
    @Override
    public void attach(Observer observer) {
        list.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObservers(String msg) {
        for (Observer observer: list){
            observer.update(msg);
        }
    }
}
