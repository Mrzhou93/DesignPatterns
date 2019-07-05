package bridge.car;

import bridge.transmission.Transmission;

public abstract class AbstractCar {
    protected Transmission gear;

    public abstract void run();

    public void setGear(Transmission gear) {
        this.gear = gear;
        this.gear.gear();
    }
}
