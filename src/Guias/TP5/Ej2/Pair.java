package Guias.TP5.Ej2;

import java.util.Objects;

public class Pair <A,B>{
    private A a;
    private B b;
    public Pair(A a, B b){
        this.a = a;
        this.b = b;
    }

    public void setA(A a) {
        this.a = a;
    }
    public void setB(B b) {
        this.b = b;
    }
    @Override
    public String toString() {
        return "[" + a + ", " + b + "]";
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Pair<?, ?> pair &&
                a.equals(pair.a) &&
                b.equals(pair.b);
    }
    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

}
