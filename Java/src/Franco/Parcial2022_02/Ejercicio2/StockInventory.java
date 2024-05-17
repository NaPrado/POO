package Franco.Parcial2022_02.Ejercicio2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

public class StockInventory implements Iterable<StockResult> {
    private StockResult[] v;
    private static int INCREMENT_DIM=5;
    private int dim;
    private int actualDim;
    Predicate<Integer> low;
    StockInventory(){
        v=new StockResult[INCREMENT_DIM];
        dim=INCREMENT_DIM;
        actualDim=0;
        low=new Predicate<Integer>() {
            @Override
            public boolean test(Integer stock) {
                return stock <=1;
            }
        };
    }

    void add(String product, int stock){
        if (actualDim==dim){
            resize();
        }
        v[actualDim++]=new StockResult(product, stock,low);
    }

    void resize(){
        v=Arrays.copyOf(v,dim+INCREMENT_DIM);
        dim+=INCREMENT_DIM;
    }
    void reduceStock(String name){
        for (int i = 0; i < actualDim; i++) {
            if (v[i].getProduct().equals(name)){
                v[i].reduceStock();
                return;
            }
        }
        throw new IllegalArgumentException("No product found with name " + name);
    }

    @Override
    public Iterator<StockResult> iterator() {
        Predicate<Integer> actualAlert=low;
        return new Iterator<StockResult>() {
            private int i=0;
            @Override
            public boolean hasNext() {
                return i!=actualDim;
            }

            @Override
            public StockResult next() {
                if (!hasNext()){
                    throw new NoSuchElementException();
                }
                StockResult ret=v[i++];
                ret.setStockAlert(actualAlert);
                return ret;
            }
        };
    }
    void setMinimumStock(Predicate<Integer> predicate){
        low=predicate;
    }
}
