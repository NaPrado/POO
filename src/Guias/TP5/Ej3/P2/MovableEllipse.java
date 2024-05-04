package Guias.TP5.Ej3.P2;

public class MovableEllipse extends Ellipse<MovablePoint> implements MovableFigure{
    MovableEllipse(MovablePoint center, double sMayorAxis,double sMinorAxis){
        super(center,sMayorAxis,sMinorAxis);
    }

    public MovablePoint[] getPoints() {
        return new MovablePoint[]{center};
    }
}
