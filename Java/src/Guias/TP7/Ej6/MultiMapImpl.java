package Guias.TP7.Ej6;

import java.util.*;

public class MultiMapImpl <K, V extends Comparable<? super V>> implements MultiMap<K, V> {
    private Map<K, Set<V>> map= new HashMap<K, Set<V>>();

    @Override
    public void put(K key, V value) {
        if (!map.containsKey(key)) {
            map.put(key, new TreeSet<>(Comparator.reverseOrder()));
            map.get(key).add(value);
        }
        map.get(key).add(value);
    }

    @Override
    public int size() {
        int result = 0;
        for (Map.Entry<K, Set<V>> entry : map.entrySet()) {
            result += entry.getValue().size();
        }
        return result;
    }

    @Override
    public int size(K key) {
        return map.get(key).size();
    }

    @Override
    public void remove(K key) {
        if (map.containsKey(key)){
            map.get(key).removeAll(map.get(key));
        }
        else throw new NoSuchElementException();
    }

    @Override
    public void remove(K key, V value) {
        if (map.containsKey(key)){
            map.get(key).remove(value);
        }
        else throw new NoSuchElementException();
    }

    @Override
    public Iterable<V> get(K key) {
        Set<V> ret= map.get(key);
        if(ret.isEmpty()){
            return null;
        }
        return ret;
    }
}
