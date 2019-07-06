package state;

public class NighttimeState implements State {
    @Override
    public void action() {
        System.out.println("晚上使用");
    }
}
