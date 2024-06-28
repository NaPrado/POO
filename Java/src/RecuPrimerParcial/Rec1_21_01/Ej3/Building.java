package RecuPrimerParcial.Rec1_21_01.Ej3;

public class Building {

    // Costo por metro cuadrado de las U.F. residenciales y comerciales
    private double m2Expense = 100.0;
    // Multiplicador sobre total para las U.F. comerciales
    private double commercialMult = 3.0;
    private Amenity[] amenities=null;

    public double getM2Expense() {
        return m2Expense;
    }

    public void setM2Expense(double m2Expense) {
        this.m2Expense = m2Expense;
    }

    public double getCommercialMult() {
        return commercialMult;
    }

    public void setCommercialMult(double commercialMult) {
        this.commercialMult = commercialMult;
    }

    public FunctionalUnit newResidentialFunctionalUnit(String name, int mc, int amb) {
        return new Residencial(this,name,mc,amb);
    }

    public FunctionalUnit newCommercialFunctionalUnit(String name, int mc) {
        return new Comercial(this,name,mc);
    }

    public void setAmenities(Amenity[] amenities) {
        this.amenities = amenities;
    }
    public Amenity[] getAmenities() {
        return amenities;
    }
}

