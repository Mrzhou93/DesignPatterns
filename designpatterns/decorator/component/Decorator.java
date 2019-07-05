package decorator.component;

/**
 * Decorator: 持有一个构件对象的实例，并定义一个将要接收附加责任的类。
 */
public class Decorator implements People
{
    private People people;

    public Decorator(People people){
        this.people = people;
    }

    @Override
    public void wear() {
        people.wear();
    }
}
