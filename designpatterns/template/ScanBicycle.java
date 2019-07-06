package template;

public class ScanBicycle extends AbstractClass {
    @Override
    void unlock() {
        System.out.println("扫码解锁");
    }

    @Override
    void ride() {
        System.out.println("骑车");
    }

    @Override
    void lock() {
        System.out.println("扫码加锁");
    }
}
