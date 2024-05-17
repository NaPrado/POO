package Guias.TP5.Ej3.P2;

public class Rectangle<P extends Point> extends Figure {
    protected P upRight, downLeft;
    Rectangle(P upRight, P downLeft){
        this.upRight = upRight;
        this.downLeft=downLeft;
    }
    public double base(){
        return upRight.distanceX(downLeft);
    }
    public double height(){
        return upRight.distanceY(downLeft);
    }
    public double area(){
        return base()* height();
    }
    public double perimeter(){
        return (base()*2)+(height()*2);
    }

    @Override
    public String toString() {
        return "Rectángulo [ {%.2f , %.2f} , {%.2f , %.2f} ]".formatted(upRight.getX(), upRight.getY(),downLeft.getX(),downLeft.getY());
    }
}
