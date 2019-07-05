package singletom;

public class SingletomSync {
    public static volatile SingletomSync instance;

    private SingletomSync(){}

    public static SingletomSync getInstance(){
        if (instance == null){
            synchronized (SingletomSync.class){
                if (instance == null){
                    instance = new SingletomSync();
                }
            }
        }
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
