package mediator;

public class PlayerB extends AbstractPlayer {

    PlayerB(Mediator mediator, int money) {
        super(mediator, money);
    }

    @Override
    public void changeMoney(int money, AbstractPlayer player) {
        int BMoney = this.getMoney() + money;
        this.setMoney(BMoney);
        int AMoney = player.getMoney() - money;
        player.setMoney(AMoney);
    }

    @Override
    public void getInfo() {
        System.out.println("B剩余" + getMoney() + "元");
    }
}
