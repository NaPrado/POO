package Guias.TP4.Ej6;

public class SimpleExpression extends Expression {

    private boolean value;

    public SimpleExpression(boolean value) {
        this.value = value;
    }

    @Override
    public boolean evaluate() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

}

