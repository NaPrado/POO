package Franco.SegundosParciales.Rec2_22_01.Ej1;
import java.util.List;
import java.util.SortedMap;
import java.util.function.Predicate;

public interface MysteryCollection  <E extends Comparable<?super E>> extends List<E> {
    SortedMap<E, Integer> toSortedBag(Predicate<E> predicate);

    default SortedMap<E, Integer> toSortedBag() {
        return toSortedBag(e -> true);
    }
}
