package bridge;

import bridge.car.AbstractCar;
import bridge.car.BMW;
import bridge.car.BenZ;
import bridge.transmission.Auto;
import bridge.transmission.Transmission;

public class BridgeTest {
    public static void main(String[] args) {
        Transmission auto = new Auto();
        AbstractCar bmw = new BMW();
        bmw.setGear(auto);
        bmw.run();
    }
}
