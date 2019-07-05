package adapter;

/**
 * 手头有一个MircoDataLine，但是实际需要MinDataLine，两者不兼容
 */

public class Test {
    public static void main(String[] args) {
        Target target = new MircoDataLine();
        target.connection();

        Target adapter = new Adapter();
        adapter.connection();
    }
}
