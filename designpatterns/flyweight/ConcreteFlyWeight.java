package flyweight;

/**
 * 具体的享元类，该类的对象将会被复用
 */
public class ConcreteFlyWeight implements FlyWeight {
    private String name;

    public ConcreteFlyWeight(String name){
        this.name = name;
    }

    @Override
    public void action(String externalState) {
        System.out.println("name=" + name + " outerState=" + externalState);
    }
}
