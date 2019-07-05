package flyweight;

public class FlyWeightTest {
    public static void main(String[] args) {
        FlyWeight flyWeight = FlyWeightFactory.getFlyWeight("A");
        FlyWeight flyWeight1 = FlyWeightFactory.getFlyWeight("A");
        FlyWeight flyWeight2 = FlyWeightFactory.getFlyWeight("B");
    }
}
