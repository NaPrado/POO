package Taller1.Ej4;

public class MultipleCounter extends Counter {

    private final int times;

    public MultipleCounter(int times) {
        super();
        this.times = times;
    }

    @Override
    public void increment() {
        int aux = times;
        while(aux > 0) {
            super.increment();
            aux--;
        }
    }
    @Override
    public void decrement() {
        int aux = times;
        while(aux > 0) {
            super.decrement();
            aux--;
        }
    }
}
