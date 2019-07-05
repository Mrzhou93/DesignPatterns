package singletom;

public class Singleton {
    public static Singleton instance = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        SingletomSync sync = SingletomSync.getInstance();
        SingletomSync sync1 = SingletomSync.getInstance();
        SingletomSync sync2 = SingletomSync.getInstance();

        System.out.println(sync);
        System.out.println(sync1);
        System.out.println(sync2);
    }
}
