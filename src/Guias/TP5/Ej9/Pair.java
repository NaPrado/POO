package Guias.TP5.Ej9;

public class Pair<A extends Comparable<? super A>, B extends Comparable<? super B>> implements Comparable<Pair <A,B>>{
    private A a;
    private B b;
    Pair(A a, B b){
        this.a=a;
        this.b=b;
    }

    @Override
    public String toString() {
        return "[" + a + " " + b + "]";
    }

    @Override
    public int compareTo(Pair<A, B> o) {
        int toRet=a.compareTo(o.a);
        if (toRet==0){
            toRet=b.compareTo(o.b);
        }
        return toRet;
    }
}
