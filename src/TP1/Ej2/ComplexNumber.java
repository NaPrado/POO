package TP1.Ej2;

public class ComplexNumber {
    private final double real, imaginary;

    public ComplexNumber(double real, double imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }

    public ComplexNumber(double real){
        this.real=real;
        this.imaginary=0;
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
}
