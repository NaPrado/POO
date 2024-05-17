package Guias.TP5.Ej1;

import java.util.Objects;

public class Pair <A,B>{
    private A a;
    private B b;
    public Pair(A a, B b){
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "[" + a + ", " + b + "]";
    }

    @Override
    public boolean equals(Object obj) {
        return this==obj ||(obj instanceof Pair<?,?> o && o.a.equals(a) && o.b.equals(b));
    }
    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

}
