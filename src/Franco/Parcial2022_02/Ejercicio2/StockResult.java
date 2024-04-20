package Franco.Parcial2022_02.Ejercicio2;

import java.util.function.Predicate;

public class StockResult extends StockProduct{
    Predicate<Integer> alert;

    StockResult(String product, int stock, Predicate<Integer> alert){
        super(product,stock);
        this.alert=alert;
    }
    void setStockAlert(Predicate<Integer> ivonne){
        alert=ivonne;
    }
    @Override
    public String toString() {
        return "%s <> %s".formatted(super.toString(),alert.test(getStock())?"Low Stock!":"Stock OK");
    }
}
