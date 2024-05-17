package Taller.Taller7.Ej1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SimpleList<E>extends List<E> {
   SimpleList<E> map(Mapper<E> mapper);
}
