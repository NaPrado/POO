package Guias.TP7.Ej1;


import java.util.List;

public interface FilterList<E> extends List<E>{
    FilterList<E> filter(Criteria<E> criterio);
}
