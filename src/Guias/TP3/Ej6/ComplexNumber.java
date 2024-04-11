package Guias.TP3.Ej6;

import java.util.Objects;

public class ComplexNumber {
    private final double real, imaginary;

    public ComplexNumber(double real, double imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }

    public ComplexNumber(Number real){
        this(real.doubleValue(),0);
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
    ComplexNumber plus(ComplexNumber c){
        return new ComplexNumber(this.real+c.getReal(),this.imaginary+c.getImaginary());
    }
    ComplexNumber plus(Number c){
        return new ComplexNumber(this.real+c.doubleValue(),this.imaginary);
    }

    @Override
    public String toString() {
        return "%.2f %c %.2f".formatted(real, imaginary > 0 ? '+' : '-', Math.abs(imaginary));
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof ComplexNumber that &&
                Double.compare(that.real, real) == 0 &&
                Double.compare(that.imaginary, imaginary) == 0;
    }


    @Override
    public int hashCode() {
        return Objects.hash(real,imaginary);
    }
}

