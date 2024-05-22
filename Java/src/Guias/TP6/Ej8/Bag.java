package Guias.TP6.Ej8;

public interface Bag <E>{
    void add(E elem);
    int count(E elem);
    int size();
    int sizeDistinct();
    boolean contains(E elem);
    void remove(E elem);
}
