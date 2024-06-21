package RecuPrimerParcial.Rec1_23_02.Ej2;

public class LoyaltyMember {
    private static int id;
    String name;
    double milles=0;
    LoyaltyProgram lp;
    Categories cat;
    LoyaltyMember(LoyaltyProgram lp, String name, Categories cat){
        id=lp.getCurrentId();
        this.name=name;
        this.cat=cat;
        this.lp=lp;
    }
    public void addMilesFromPurchase(double miles){
        milles+=miles * cat.gMpp();
        if(cat.gCond().test(miles) && lp.gProm()){
            milles+= cat.gSuma();
        }

    }

    @Override
    public String toString() {
        return "Loyalty Member %d from %s with %f miles".formatted(id,name,milles);
    }
}
