package command;

public class CommandClose implements Command {

    private Receiver receiver;

    CommandClose(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        receiver.close();
    }
}
