package Guias.TP5.Ej3.P2;

public class MovableRectangle extends Rectangle<MovablePoint> implements MovableFigure{
    MovableRectangle(MovablePoint upRight,MovablePoint downLeft){
        super(upRight,downLeft);
    }

    public MovablePoint[] getPoints() {
        return new MovablePoint[]{upRight,downLeft};
    }
}
