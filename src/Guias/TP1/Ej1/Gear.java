package Guias.TP1.Ej1;

public class Gear {
    private final int chainRing;
    private final double cog;
    public Gear(int chainRing, double cog){
        this.chainRing=chainRing;
        this.cog=cog;
    }
    public int getChainRing(){
        return this.chainRing;
    }
    public double getCog(){
        return this.cog;
    }
    public double getRatio(){
        return this.chainRing/this.cog;
    }
}
