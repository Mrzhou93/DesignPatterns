package mediator;

public abstract class AbstractPlayer {

    private Mediator mediator;
    private int money;

    AbstractPlayer(Mediator mediator, int money){
        this.mediator = mediator;
        this.money = money;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public abstract void changeMoney(int money, AbstractPlayer player);

    public abstract void getInfo();

}
