package command;

public class CommandOpen implements Command {

    private Receiver receiver;

    CommandOpen(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        receiver.open();
    }
}
