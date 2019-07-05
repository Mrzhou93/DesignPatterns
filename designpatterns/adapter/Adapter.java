package adapter;

public class Adapter extends MinDataLine implements Target {
    @Override
    public void connection() {
        System.out.println("插入转换头");
        super.connection();
    }
}
