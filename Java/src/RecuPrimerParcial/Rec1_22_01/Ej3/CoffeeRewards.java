package RecuPrimerParcial.Rec1_22_01.Ej3;

import java.util.function.Function;

public class CoffeeRewards {
    private static final int INITIAL_ID=1001;
    private int id=INITIAL_ID;
    Function<Double,Double> prom;
    CoffeeRewards(Function<Double,Double> prom){
        setPointsPromotion(prom);
    }
    public void setPointsPromotion(Function<Double,Double> prom){
        this.prom = prom;
    }
    public CoffeeCard buildCard(String name, CardType type){
        return new CoffeeCard(name,type,id++,this);
    }
}
