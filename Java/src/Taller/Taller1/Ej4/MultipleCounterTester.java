package Taller.Taller1.Ej4;

public class MultipleCounterTester{
    public static void main(String[] args) {
    Counter mc = new MultipleCounter(2);
    System.out.println(mc.getCount());
    mc.increment();
    System.out.println(mc.getCount());
    mc.increment();
    System.out.println(mc.getCount());
    mc.decrement();
    System.out.println(mc.getCount());
    }
}

