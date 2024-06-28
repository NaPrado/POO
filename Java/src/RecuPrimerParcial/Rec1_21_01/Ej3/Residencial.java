package RecuPrimerParcial.Rec1_21_01.Ej3;

public class Residencial extends FunctionalUnit{
    private Building b;
    private String name;
    private int mc;
    private int amb;
    private static final String TYPE="Residencial";

    Residencial(Building b,String name, int mc, int amb){
        this.b=b;
        this.name=name;
        this.mc=mc;
        this.amb=amb;
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
        double cost=mc*b.getM2Expense()*amb;
        Amenity[] amenities=b.getAmenities();
        if (amenities!=null){
            for (Amenity e:amenities){
                cost+=e.getCost(amb);
            }
        }
        return cost;
    }

    @Override
    public String getTyoe() {
        return TYPE;
    }

}
