package TP3.Ej5;

public class Ej5a {
    public static void main(String[] args) {
        A a = new A();
        a.print(3);//A Integer Integer
        a.print(3.14);//A Number Double
        a.print((Number)3);//A Number Integer
        a.print((Object)3);//A Object Integer

        A b1 = new B();
        b1.print(3.14);//B Number Double
        b1.print("Hola");//A Object String
        b1.print((Number)3);//B Number Integer
        b1.print((Object)3);//A Object Integer

        B b2 = new B();
        b2.print(3.14);//B Number Double
        b2.print("Hola");//A Object String
        b2.print((Number)3);//B Number Integer
        b2.print((Object)3);//A Object Integer
    }
}
