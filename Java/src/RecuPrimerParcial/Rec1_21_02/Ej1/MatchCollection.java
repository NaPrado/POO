package RecuPrimerParcial.Rec1_21_02.Ej1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

public class MatchCollection <E> implements Iterable<MatchElement<E>> {
    private E[] v;
    private Predicate<E> p;
    MatchCollection(E[] v){
        this.v=v;
        this.p= new Predicate<E>(){

            @Override
            public boolean test(E e){
                return true;
            }
        };
    }
    MatchCollection(E[] v,Predicate<E> p){
        this.v=v;
        this.p=p;
    }
    public void setCondition(Predicate<E> p){
        this.p=p;
    }
    public Iterator<MatchElement<E>> iterator(){
    Predicate<E> pred=p;
    return new Iterator<MatchElement<E>>(){
            private int c=0; 
            @Override
            public boolean hasNext(){
                return c<v.length;
            }
            @Override
            public MatchElement<E> next(){
                if(!hasNext()){
                    throw new NoSuchElementException();
                }
                return new MatchElement<E>(v[c++],pred);
            }
        };
    }
}
