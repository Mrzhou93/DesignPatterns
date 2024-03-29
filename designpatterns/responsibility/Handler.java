package responsibility;

public abstract class Handler {
    protected Handler successor = null;

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract String handlerFeeRequest(String user, double fee);
}
