package bridge.transmission;

public class Auto implements Transmission {
    @Override
    public void gear() {
        System.out.println("自动挡");
    }
}
