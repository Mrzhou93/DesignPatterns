package mediator;

public class MediatorTest {
    public static void main(String[] args) {
        Mediator mediator = new MyMediator();

        AbstractPlayer playerA = new PlayerA(mediator, 20);
        AbstractPlayer playerB = new PlayerB(mediator, 18);

        ((MyMediator) mediator).setPlayerA(playerA);
        ((MyMediator) mediator).setPlayerB(playerB);

        playerA.getInfo();
        playerB.getInfo();
        System.out.println();

        mediator.winnerAndMoney(5, playerA);

        playerA.getInfo();
        playerB.getInfo();
        System.out.println();

        mediator.winnerAndMoney(10, playerB);

        playerA.getInfo();
        playerB.getInfo();
        System.out.println();
    }
}
