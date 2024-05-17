package Guias.TP4.Ej4;

public class MovableTriangle extends Triangle implements MovableFigure{
    MovableTriangle(MovablePoint first, MovablePoint second, MovablePoint third){
        super(first,second,third);
    }

    @Override
    public MovablePoint[] getPoints() {
        return new MovablePoint[]{
                (MovablePoint) first,
                (MovablePoint) second,
                (MovablePoint) third};
    }

}
