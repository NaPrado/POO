package Guias.TP5.Ej6;


public interface AccessStack <E> extends Stack<E> {
    int getPopAccesses();
    int getPushAccesses();
}
