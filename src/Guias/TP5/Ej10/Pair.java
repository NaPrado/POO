package Guias.TP5.Ej10;

public class Pair <A extends Comparable<? super A>, B extends Comparable<? super B>> implements Comparable<Pair <A,B>>{
    private A a;
    private B b;
    Pair(A a,B b){
        this.a=a;
        this.b=b;
    }

    @Override
    public String toString() {
        return "[" + a + " " + b + "]";
    }

    @Override
    public int compareTo(Pair<A, B> o) {
        int toRet=o.a.compareTo(a);
        if (toRet==0){
            toRet=o.b.compareTo(b);
        }
        return toRet;
    }
}
