package state;

public class DaytimeState implements State{

    @Override
    public void action() {
        System.out.println("白天使用");
    }
}
