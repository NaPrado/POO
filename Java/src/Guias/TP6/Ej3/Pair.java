package Guias.TP6.Ej3;

public class Pair <T>{
    private T first;
    private T second;
    public Pair(T first, T second){
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "# %s + %s #".formatted(first, second);
    }
}
