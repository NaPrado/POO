package Guias.TP4.Ej4;

public class Triangle extends Figure {
    protected Point first,second,third;
    private double semiPerimetre,lado1,lado2,lado3;
    Triangle(Point first, Point second, Point third){
        this.first=first;
        this.second=second;
        this.third=third;
        this.lado1=first.distance(second);
        this.lado2=second.distance(third);
        this.lado3=third.distance(first);
        this.semiPerimetre=(lado1+lado2+lado3)/2;
    }
    private double heronStep(double lado){
        return (semiPerimetre-lado);
    }
    @Override
    public double area() {
        return Math.sqrt(semiPerimetre*heronStep(lado1)*heronStep(lado2)*heronStep(lado3));
    }

    @Override
    public double perimeter() {
        return semiPerimetre*2;
    }

    @Override
    public String toString() {
        return "Triángulo [ {%.2f , %.2f} , {%.2f , %.2f} , {%.2f , %.2f} ]\n".formatted(first.getX(),first.getY(),second.getX(),second.getY(),third.getX(),third.getY());
    }
}
