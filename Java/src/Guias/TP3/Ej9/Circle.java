package Guias.TP3.Ej9;

public class Circle extends Ellipse{
    Circle(Point center, double radius){
        super(center,2*radius,2*radius);
    }

    @Override
    public String toString() {
        return "Círculo [Centro: {%.2f , %.2f} , Radio: %.2f}]".formatted(center.getX(),center.getY(),sMayorAxis/2);
    }
}
