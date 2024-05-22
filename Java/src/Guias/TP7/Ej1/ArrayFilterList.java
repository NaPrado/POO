package Guias.TP7.Ej1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ArrayFilterList<E> extends ArrayList<E> implements FilterList<E>{
    @Override
    public FilterList<E> filter(Criteria<E> criterio) {
        FilterList<E> ret= new ArrayFilterList<E>();
        for (E elem: this){
            if (criterio.predicacion(elem)){
                ret.add(elem);
            }
        }
        return ret;
    }
}
