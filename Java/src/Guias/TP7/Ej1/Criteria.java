package Guias.TP7.Ej1;

import java.util.List;
import java.util.function.Predicate;

@FunctionalInterface
public interface Criteria<E> {
    Boolean predicacion(E obj);
}
