package lesson9;

public class ExpressionEvaluator {
    public static int eval(Expr expr) {
        return switch (expr) {
            case Constant c -> c.value();
            case Add a -> eval(a.left()) + eval(a.right());
            case Multiply m -> eval(m.left()) * eval(m.right());
        };
    }
}
