package Guias.TP4.Ej6;

public class AndExpression extends BinaryExpression {

    public AndExpression(Expression leftExpression, Expression rightExpression) {
        super(leftExpression, rightExpression);
    }

    @Override
    public boolean evaluate() {
        return leftExpression.evaluate() && rightExpression.evaluate();
    }

}

