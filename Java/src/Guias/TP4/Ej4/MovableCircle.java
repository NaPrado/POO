package Guias.TP4.Ej4;

public class MovableCircle extends Circle implements MovableFigure{
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
