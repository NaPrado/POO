package Guias.TP5.Ej3.P2;

public class Ellipse<P extends Point> extends Figure {
    protected P center;
    protected double sMayorAxis,sMinorAxis;
    Ellipse(P center,double sMayorAxis, double sMinorAxis){
        this.center=center;
        this.sMayorAxis=sMayorAxis;
        this.sMinorAxis=sMinorAxis;
    }

    @Override
    public double area() {
        return Math.PI / 4 * sMayorAxis * sMinorAxis;
    }

    @Override
    public double perimeter() {
        return Math.PI / 2 * (sMayorAxis + sMinorAxis);
    }

    @Override
    public String toString() {
        return "Elipse [Centro: {%.2f , %.2f}, DMayor: %.2f, DMenor: %.2f]".formatted(center.getX(),center.getY(),sMayorAxis,sMinorAxis);
    }
}

