package proxy;

public class RealRenter implements Rent {
    @Override
    public void rent() {
        System.out.println("真实的出租者要把房子出租出去");
    }
}
