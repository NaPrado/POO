package TP4.Ej4;

public interface MovableFigure extends Movable{
    MovablePoint[] getPoints();

    @Override
    default void moveEast(double delta){
        MovablePoint[] points=getPoints();
        for (MovablePoint p:points){
            p.moveEast(delta);
        }
    }

    @Override
    default void moveSouth(double delta){
        MovablePoint[] points=getPoints();
        for (MovablePoint p:points){
            p.moveSouth(delta);
        }
    }

    @Override
    default void moveNorth(double delta){
        MovablePoint[] points=getPoints();
        for (MovablePoint p:points){
            p.moveNorth(delta);
        }
    }

    @Override
    default void moveWest(double delta){
        MovablePoint[] points=getPoints();
        for (MovablePoint p:points){
            p.moveWest(delta);
        }
    }
}
