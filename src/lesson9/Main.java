package lesson9;

import static lesson9.ExpressionEvaluator.eval;

public class Main {
    public static void main(String[] args) {
        Expr expr = new Multiply(
                new Add(new Constant(2), new Constant(3)),
                new Constant(4)
        );

        System.out.println("Result: " + eval(expr));
    }
}

