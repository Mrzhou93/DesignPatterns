package observer;


import java.util.ArrayList;
import java.util.List;

public interface Subject {

    List<Observer> list = new ArrayList<>();

    void attach(Observer observer);

    void detach(Observer observer);

    void notifyObservers(String msg);
}
