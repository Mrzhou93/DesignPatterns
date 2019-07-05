package responsibility;

public class ResponsibilityTest {
    public static void main(String[] args) {
        Handler h1 = new ProjectManager();
        Handler h2 = new DeptManager();
        Handler h3 = new GeneralManager();

        h1.setSuccessor(h2);
        h2.setSuccessor(h3);

        String test1 = h1.handlerFeeRequest("Bill", 300);
        System.out.println(test1);

        String test2 = h1.handlerFeeRequest("Mike", 300);
        System.out.println(test2);

        String test3 = h1.handlerFeeRequest("Bill", 700);
        System.out.println(test3);

        String test4 = h1.handlerFeeRequest("Bill", 1100);
        System.out.println(test4);
    }
}
