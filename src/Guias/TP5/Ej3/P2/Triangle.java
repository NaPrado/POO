package Guias.TP5.Ej3.P2;

public class Triangle<P extends Point> extends Figure {
    protected P first,second,third;
    private double semiPerimetre,lado1,lado2,lado3;
    Triangle(P first, P second, P third){
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
