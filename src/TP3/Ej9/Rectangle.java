package TP3.Ej9;

public class Rectangle extends Figure{
    Point upRigth, downLeft;
    Rectangle(Point upRigth,Point downLeft){
        this.upRigth=upRigth;
        this.downLeft=downLeft;
    }
    public double base(){
        return upRigth.distanceX(downLeft);
    }
    public double height(){
        return upRigth.distanceY(downLeft);
    }
    public double area(){
        return base()* height();
    }
    public double perimeter(){
        return (base()*2)+(height()*2);
    }

    @Override
    public String toString() {
        return "Rectángulo [ {%.2f , %.2f} , {%.2f , %.2f} ]".formatted(upRigth.getX(),upRigth.getY(),downLeft.getX(),downLeft.getY());
    }
}
