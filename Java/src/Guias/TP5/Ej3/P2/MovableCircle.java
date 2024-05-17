package Guias.TP5.Ej3.P2;

public class MovableCircle extends Circle<MovablePoint> implements MovableFigure{
    MovableCircle(MovablePoint center, double Radius){
        super(center,Radius);
    }

    @Override
    public MovablePoint[] getPoints() {
        return new MovablePoint[]{
                (MovablePoint) center
        };
    }
}
