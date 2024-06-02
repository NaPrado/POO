package Guias.TP7.Ej5;

import Guias.TP6.Ej8.BagImpl;

import java.util.*;

public class IterableBagImpl <E extends Comparable<? super E>> extends BagImpl<E> implements IterableBag<E>{
    IterableBagImpl(){
        map=new TreeMap<>(Comparator.reverseOrder());
    }

    @Override
    public Iterable<E> elements() {
        List<E> elements=new ArrayList<>();
        for (Map.Entry<E,Integer> entry : map.entrySet()){
            for (int i=0;i<entry.getValue();i++){
                elements.add(entry.getKey());
            }
        }
        return elements;
    }

    @Override
    public Iterable<E> elementsDistinct() {
        return map.keySet();
    }
}
