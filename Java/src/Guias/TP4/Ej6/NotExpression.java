package Guias.TP4.Ej6;

public class NotExpression extends Expression {

    private Expression expression;

    public NotExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public boolean evaluate() {
        return !expression.evaluate();
    }

}

