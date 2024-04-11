package Guias.TP3.Ej9;

public class Point {
    private double x,y;
    Point(double x,double y){
        this.x=x;
        this.y=y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public double distance(Point b){
        return Math.sqrt(Math.pow(x-b.getX(),2)+Math.pow(y- b.getY(),2));
    }
    public double distanceX(Point b){
        return Math.abs(x-b.getX());
    }
    public double distanceY(Point b){
        return Math.abs(y- b.getY());
    }
}
