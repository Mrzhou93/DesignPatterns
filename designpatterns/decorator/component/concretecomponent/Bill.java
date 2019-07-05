package decorator.component.concretecomponent;

import decorator.component.People;

/**
 * ConcreteComponent: 定义一个将要接收附加责任的类
 */

public class Bill implements People {
    @Override
    public void wear() {
        System.out.println("穿什么衣服？");
    }
}
