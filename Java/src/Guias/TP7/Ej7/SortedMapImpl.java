package Guias.TP7.Ej7;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class SortedMapImpl<K extends Comparable<K>,V> extends TreeMap<K,V> implements SortedMap<K,V>{
    @Override
    public V firstValue() {
        return this.firstEntry().getValue();
    }

    @Override
    public Iterator<Map.Entry<K, V>> iterator() {
        return this.entrySet().iterator();
    }

}
