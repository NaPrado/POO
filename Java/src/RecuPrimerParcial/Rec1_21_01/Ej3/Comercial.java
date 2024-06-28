package RecuPrimerParcial.Rec1_21_01.Ej3;

public class Comercial extends FunctionalUnit{
    private String name;
    private int mc;
    private Building b;
    private static final String TYPE = "Comercial";
    Comercial(Building b,String name, int mc) {
        this.b=b;
        this.name=name;
        this.mc=mc;
    }

    @Override
    public int getMC() {
        return mc;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getCost() {
        return b.getM2Expense()*mc* b.getCommercialMult();
    }

    @Override
    public String getTyoe() {
        return TYPE;
    }
}
