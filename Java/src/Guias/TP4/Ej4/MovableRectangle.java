package Guias.TP4.Ej4;

public class MovableRectangle extends Rectangle implements MovableFigure{
    MovableRectangle(MovablePoint upRight,MovablePoint downLeft){
        super(upRight,downLeft);
    }

    public MovablePoint[] getPoints() {
        return new MovablePoint[]{
                (MovablePoint) upRight,
                (MovablePoint) downLeft};
    }
}
