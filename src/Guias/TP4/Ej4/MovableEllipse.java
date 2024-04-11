package Guias.TP4.Ej4;

public class MovableEllipse extends Ellipse implements MovableFigure{
    MovableEllipse(MovablePoint center, double sMayorAxis,double sMinorAxis){
        super(center,sMayorAxis,sMinorAxis);
    }

    public MovablePoint[] getPoints() {
        return new MovablePoint[]{
                (MovablePoint) center
        };
    }
}
