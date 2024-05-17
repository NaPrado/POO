package Guias.TP5.Ej3.P2;

public class MovableTester {

    public static void main(String[] args) {
        /*
        MovablePoint aPoint = new MovablePoint(1,2);
        System.out.println(aPoint);
        aPoint.moveNorth(3);
        System.out.println(aPoint);
        */
        MovablePoint aPoint = new MovablePoint(1,2);
        MovableEllipse anEllipse = new MovableEllipse(aPoint,2,3);
        System.out.println(anEllipse);
        anEllipse.moveNorth(3);
        System.out.println(anEllipse);
    }
}

