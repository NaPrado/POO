package Guias.TP6.Ej10;

import java.util.*;

public class MultiSortedCollectionImpl <E> implements MultiSortedCollection<E>{
    Set<E> elements = new HashSet<>();
    Map<Comparator, Set<E>> map = new HashMap<>();
    @Override
    public void add(Comparator<E> comp) {
        TreeSet<E> newTreeSet = new TreeSet<>(comp);
        if(!elements.isEmpty()){
            newTreeSet.addAll(elements);
        }
        map.put(comp, newTreeSet);
    }

    @Override
    public void add(E elem) {
        elements.add(elem);
        if (map.isEmpty()){
            throw new IllegalStateException();
        }
        for(Set<E> trees:map.values()){
            trees.add(elem);
        }
    }

    @Override
    public void remove(E elem) {
        elements.remove(elem);
        if (map.isEmpty()){
            throw new IllegalStateException();
        }
        for(Set<E> trees:map.values()){
            trees.remove(elem);
        }
    }

    @Override
    public Iterable<E> iterable(Comparator<E> comp) {
        if (!map.containsKey(comp)){
            throw new IllegalStateException();
        }
        return map.get(comp);
    }
}
