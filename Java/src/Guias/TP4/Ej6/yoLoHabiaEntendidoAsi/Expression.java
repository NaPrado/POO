package Guias.TP4.Ej6.yoLoHabiaEntendidoAsi;

public abstract class Expression {
    protected boolean value;
    public boolean evaluate(){
        return value;
    }

    public Expression not() {
        return new SimpleExpression(!this.value);
    }

    public Expression or(Expression expression) {
        return new SimpleExpression(this.value || expression.value);
    }

    public Expression and(Expression expression) {
        return new SimpleExpression(this.value && expression.value);
    }
}
