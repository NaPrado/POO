package RecuPrimerParcial.Rec1_23_02.Ej2;

import java.util.function.Predicate;

public enum Categories {
    SILVER(10, (amt -> amt>1000),100),
    GOLD(20,(amt->(amt>1000 && amt<5000)),500),
    DIAMOND(30,(amt->true),1000);
    int mpp, suma;
    Predicate<Double> cond;
    Categories(int mpp,Predicate<Double> cond,int suma){
        this.mpp=mpp;
        this.cond=cond;
        this.suma=suma;
    }

    public int gMpp() {
        return mpp;
    }

    public int gSuma() {
        return suma;
    }

    public Predicate<Double> gCond() {
        return cond;
    }
}
