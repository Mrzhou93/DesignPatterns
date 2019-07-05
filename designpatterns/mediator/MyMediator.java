package mediator;

public class MyMediator implements Mediator {

    private AbstractPlayer playerA;
    private AbstractPlayer playerB;

    public void setPlayerA(AbstractPlayer playerA) {
        this.playerA = playerA;
    }

    public void setPlayerB(AbstractPlayer playerB) {
        this.playerB = playerB;
    }

    @Override
    public void winnerAndMoney(int money, AbstractPlayer player) {
        if (player == playerA){
            playerA.changeMoney(money, playerB);
        } else {
            playerB.changeMoney(money, playerA);
        }
    }
}
