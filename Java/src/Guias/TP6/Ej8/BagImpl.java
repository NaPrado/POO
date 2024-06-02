package Guias.TP6.Ej8;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class BagImpl <E> implements Bag<E>{
    protected Map<E,Integer> map=new HashMap<E,Integer>();
    private int size=0;
    @Override
    public void add(E elem) {
        map.put(elem,map.getOrDefault(elem,0)+1);
        size++;
    }

    @Override
    public int count(E elem) {
        return map.getOrDefault(elem,0);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int sizeDistinct() {
        return map.size();
    }

    @Override
    public boolean contains(E elem) {
        return map.containsKey(elem);
    }

    @Override
    public void remove(E elem) {
        if(!map.containsKey(elem)){
            throw new NoSuchElementException();
        }
        if(map.get(elem)==1){
            map.remove(elem);
        } else {
            map.put(elem,map.get(elem)-1);
        }
        size--;
    }
}
