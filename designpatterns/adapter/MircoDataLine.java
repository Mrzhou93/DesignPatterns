package adapter;

/**
 * 实际上使用的接口
 */
class MircoDataLine implements Target {
    @Override
    public void connection() {
        System.out.println("使用MircoDataLine，但是不兼容");
    }
}
