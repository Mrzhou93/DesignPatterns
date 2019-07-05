package interpreter;

public class InterpreterTest {
    public static void main(String[] args) {
        System.out.println(
                new Minus().interpret(new Context(
                        new Plus().interpret(new Context(12, 23)), 3)
                )
        );
    }
}
