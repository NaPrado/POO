package Guias.TP5.Ej3.P2;

public class Circle<P extends Point> extends Ellipse<P> {
    Circle(P center, double radius){
        super(center,2*radius,2*radius);
    }

    @Override
    public String toString() {
        return "Círculo [Centro: {%.2f , %.2f} , Radio: %.2f}]".formatted(center.getX(),center.getY(),sMayorAxis/2);
    }
}
