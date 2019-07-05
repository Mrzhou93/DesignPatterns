package proxy;

import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) {
        // 静态代理
        Agent agent = new Agent();
        agent.rent();
        System.out.println("静态代理结束");

        // 动态代理
        System.out.println();
        System.out.println("动态代理开始");
        RealRenter realRenter = new RealRenter();

        DynamicProxy dp = new DynamicProxy();
        dp.setRent(realRenter);
        Rent proxy = (Rent) dp.getProxy();
        proxy.rent();
    }
}
