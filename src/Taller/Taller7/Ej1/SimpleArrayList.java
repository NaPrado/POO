package Taller.Taller7.Ej1;

import java.util.ArrayList;

public class SimpleArrayList<E> extends ArrayList<E> implements SimpleList<E> {
    @Override
    public SimpleList<E> map(Mapper<E> mapper) {
        SimpleList<E> toRet= new SimpleArrayList<>();
        for (E elem : this){
            toRet.add(mapper.map(elem));
        }
        return toRet;
    }
}
