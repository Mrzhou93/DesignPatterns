package mediator;

public class PlayerA extends AbstractPlayer {

    PlayerA(Mediator mediator, int money) {
        super(mediator, money);
    }

    @Override
    public void changeMoney(int money, AbstractPlayer player) {
        int AMoney = this.getMoney() + money;
        this.setMoney(AMoney);
        int BMoney = player.getMoney() - money;
        player.setMoney(BMoney);
    }

    @Override
    public void getInfo() {
        System.out.println("A剩余" + getMoney() + "元");
    }
}
