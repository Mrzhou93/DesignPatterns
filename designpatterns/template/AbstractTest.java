package template;

public class AbstractTest {
    public static void main(String[] args) {
        AbstractClass a1 = new ScanBicycle();

        a1.lock();
        a1.ride();
        a1.unlock();
    }
}
