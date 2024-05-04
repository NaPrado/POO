package Guias.TP5.Ej3.P2;

public class MovableTriangle extends Triangle<MovablePoint> implements MovableFigure{
    MovableTriangle(MovablePoint first, MovablePoint second, MovablePoint third){
        super(first,second,third);
    }

    @Override
    public MovablePoint[] getPoints() {
        return new MovablePoint[]{first, second, third};
    }

}
