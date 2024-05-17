package Guias.TP4.Ej15;

import Guias.TP4.Ej14.Operation;

import static java.lang.Math.pow;

public enum ExtendedOperation implements Operation {
    POTENCIA("^"){
        @Override
        public double apply(double a, double b) {
            return (Math.pow(a,b));
        }
    },
    MODULO("%"){
        @Override
        public double apply(double a, double b) {
            return (a%b);
        }
    };
    String symbol;
    ExtendedOperation(String symbol){
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol ;
    }
}
