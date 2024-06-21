package RecuPrimerParcial.Rec1_23_02.Ej2;

public class LoyaltyProgram {
    private int currentId = 1001;

    public int getCurrentId() {
        return currentId++;
    }
    boolean prom=false;
    public void setPromotionIsActive(boolean prom){
        this.prom=prom;
    }
    public boolean gProm(){
        return prom;
    }
}
