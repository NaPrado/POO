package RecuPrimerParcial.Rec1_22_01.Ej3;


import java.util.function.Function;

public enum CardType {
    WELCOME(10,0),
    GREEN(30,5),
    GOLD(50,10);
    private double spp;
    private double si;
    CardType(double spp, double si) {
        this.spp = spp;
        this.si = si;
    }
    public double getPoints(double amount,double actualPoints,Function<Double,Double> prom) {
        return actualPoints + prom.apply(amount * spp)+si;
    }
}
