package strategy;

public class StrategyTest {
    public static void main(String[] args) {
        Context context = new Context();

        Strategy s1 = new PrimaryStrategy();
        Strategy s2 = new IntermediateStrategy();
        Strategy s3 = new AdvanceStrategy();

        context.setStrategy(s2);
        context.action();
    }
}
