package facade;

public class FacadeTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.start();
        System.out.println();
        System.out.println("写代码呀");
        System.out.println("跑实验呀");
        System.out.println();
        computer.shutdown();
    }
}
