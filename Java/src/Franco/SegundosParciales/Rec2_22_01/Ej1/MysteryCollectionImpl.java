package Franco.SegundosParciales.Rec2_22_01.Ej1;

import java.util.*;
import java.util.function.Predicate;

public class MysteryCollectionImpl <E extends Comparable<?super E>> extends ArrayList<E> implements MysteryCollection <E> {
    @Override
    public SortedMap<E, Integer> toSortedBag(Predicate<E> predicate) {
        SortedMap<E,Integer> mapa =new TreeMap<>();
        for (E elem:this){
            if (predicate.test(elem)){
                mapa.merge(elem,1,Integer::sum);
            }
        }
        return mapa;
    }
}
