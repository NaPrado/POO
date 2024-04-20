package Franco.Parcial2022_01.Ejercicio2;

public class DictionaryEntry<E extends Comparable<? super E>>
        implements Comparable<DictionaryEntry<E>> {

    private final E key;
    private final String value;

    public DictionaryEntry(E key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public int compareTo(DictionaryEntry<E> o) {
        int cmp = key.compareTo(o.key);
        if(cmp == 0) {
            cmp = value.compareTo(o.value);
        }
        return cmp;
    }

    @Override
    public String toString() {
        return String.format("{ %s <> %s }", key, value);
    }

    public E getKey() {
        return key;
    }

}
