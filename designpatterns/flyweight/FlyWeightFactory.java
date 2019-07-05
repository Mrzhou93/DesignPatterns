package flyweight;

import java.util.concurrent.ConcurrentHashMap;

public class FlyWeightFactory {

    private static ConcurrentHashMap<String, FlyWeight> allFlyWeight =
            new ConcurrentHashMap<>();

    public static FlyWeight getFlyWeight(String name){
        if (allFlyWeight.get(name) == null){
            synchronized (allFlyWeight){
                if (allFlyWeight.get(name) == null){
                    System.out.println("实例" + name + "不存在, 开始创建");
                    FlyWeight flyWeight = new ConcreteFlyWeight(name);
                    System.out.println("实例" + name + "创建成功");
                    allFlyWeight.put(name, flyWeight);
                }
            }
        }else {
            System.out.println("实例" + name + "存在");
        }
        return allFlyWeight.get(name);
    }
}
