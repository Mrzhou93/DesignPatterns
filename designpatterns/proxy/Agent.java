package proxy;

public class Agent implements Rent {

    private Rent rent;

    public Agent(){
        super();
        rent = new RealRenter();
    }

    @Override
    public void rent() {
        before();
        rent.rent();
        after();
    }

    private void before(){
        System.out.println("将房子给代理中介");
    }

    private void after(){
        System.out.println("成功的将房子出租");
    }
}
