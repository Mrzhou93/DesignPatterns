package state;

public class StateTest {
    public static void main(String[] args) {
        Context context = new Context();

        State daytime = new DaytimeState();
        State nighttime = new NighttimeState();

        context.setState(daytime);
        context.action();

        context.setState(nighttime);
        context.action();
    }
}
