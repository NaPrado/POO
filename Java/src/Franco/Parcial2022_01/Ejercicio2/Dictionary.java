package Franco.Parcial2022_01.Ejercicio2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class Dictionary<E extends Comparable<? super E>> {

    private static final int INITIAL_DIM = 5;
    @SuppressWarnings("unchecked")
    private DictionaryEntry<E>[] array = new DictionaryEntry[INITIAL_DIM];
    private int dim;

    public Dictionary<E> addEntry(E key, String value) {
        if(dim == array.length) {
            resize();
        }
        array[dim++] = new DictionaryEntry<>(key, value);
        return this;
    }

    private void resize() {
        array = Arrays.copyOf(array, dim + INITIAL_DIM);
    }
    public DictionaryEntry<E>[] getNaturalOrderCopy() {
        return getCopy(Comparator.naturalOrder());
    }

    public DictionaryEntry<E>[] getReverseOrderCopy() {
        return getCopy(Comparator.reverseOrder());
    }

    private DictionaryEntry<E>[] getCopy(Comparator<DictionaryEntry<E>> comparator) {
        DictionaryEntry<E>[] toReturn = Arrays.copyOf(array, dim);
        Arrays.sort(toReturn, comparator);
        return toReturn;
    }

    public DictionaryEntry<E> getFirstMatch(Predicate<E> entryPredicate) {
        for(int i = 0; i < dim; i++) {
            if(entryPredicate.test(array[i].getKey())) {
                return array[i];
            }
        }
        throw new IllegalArgumentException();
    }

}
