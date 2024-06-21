package RecuPrimerParcial.Rec1_23_02.Ej3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Predicate;

public class CoinInventory{
    private static final int BLOCK=10;
    private Coin[] coins= new SilverCoin[BLOCK];
    private int dim=BLOCK;
    private int size=0;
    public CoinInventory(){}
    private CoinInventory addCoin(Coin c){
        if (size>=dim){
            resize();
        }
        coins[size++]=c;
        return this;
    }
    public CoinInventory addSilverCoin(String name,String pais,Integer year){
        return addCoin(new SilverCoin(name,pais,year));
    }
    public CoinInventory addGoldCoin(String name,String pais,Integer year,Integer karats){
        return addCoin(new GoldCoin(name,pais,year,karats));
    }
    private void resize() {
        coins=Arrays.copyOf(coins, dim+BLOCK);
        dim=dim+BLOCK;
    }
    public Coin[] getCopy(Comparator<Coin> comparator) {
        Coin[] toReturn = Arrays.copyOf(coins, dim);
        Arrays.sort(toReturn, comparator);
        return toReturn;
    }
    public Coin[] getMintDateCopy(){
        return getCopy(new Comparator<Coin>() {
            @Override
            public int compare(Coin o1, Coin o2) {
                int ret= o2.getYear().compareTo(o1.getYear());
                if (ret==0){
                    ret= o1.getPais().compareTo(o2.getPais());
                }
                return ret;
            }
        });
    }
    public Coin[] getCountriesCopy(){
        return getCopy(new Comparator<Coin>() {
            @Override
            public int compare(Coin o1, Coin o2) {
                int ret= o1.getPais().compareTo(o2.getPais());
                if (ret==0){
                    ret= o2.getYear().compareTo(o1.getYear());
                }
                return ret;
            }
        });
    }
    public Coin getFirstCoin(Predicate<Coin> pred){
        for (Coin c: coins) {
            if (pred.test(c)){
                return c;
            }
        }
        throw new RuntimeException("No such coin");
    }
}
