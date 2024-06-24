package RecuPrimerParcial.Rec1_21_02.Ej1;

import java.util.function.Predicate;

public class MatchElement <E>{
    E e;
    boolean bool;
    String s;
    public MatchElement(E e, Predicate<E> cond) {
        this.e=e;
        this.bool=cond.test(e);
        this.s=bool?"":"No ";
    }
    @Override
    public String toString(){
        return "### "+ e.toString() + " : " + s + "Match ###";
    }
    public boolean matches(){
        return bool;
    }
}
