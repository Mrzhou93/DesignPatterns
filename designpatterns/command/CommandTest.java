package command;

public class CommandTest {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();

        Command commandOpen = new CommandOpen(receiver);
        Invoker invoker = new Invoker(commandOpen);
        invoker.action();

        Command commandClose = new CommandClose(receiver);
        invoker = new Invoker(commandClose);
        invoker.action();
    }
}
