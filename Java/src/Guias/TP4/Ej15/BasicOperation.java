package Guias.TP4.Ej15;

import Guias.TP4.Ej14.Operation;

public enum BasicOperation implements Operation {
    SUMA ("+"){
        @Override
        public double apply(double a, double b) {
            return (a+b);
        }
    },
    RESTA ("-"){
        @Override
        public double apply(double a, double b) {
            return (a-b);
        }
    },
    DIVISION ("/"){
        @Override
        public double apply(double a, double b) {
            return (a/b);
        }
    },
    MULTIPICACION ("*"){
        @Override
        public double apply(double a, double b) {
            return (a*b);
        }
    };
    String symbol;
    BasicOperation(String symbol){
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol ;
    }
}
