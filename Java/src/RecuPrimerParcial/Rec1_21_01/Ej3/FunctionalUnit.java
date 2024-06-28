package RecuPrimerParcial.Rec1_21_01.Ej3;

public abstract class FunctionalUnit {
    public abstract int getMC();
    public abstract String getName();
    public abstract double getCost();
    public abstract String getTyoe();
    @Override
    public String toString() {
        return "%s: U.F. %s (  %dm2 ) : $%.2f".formatted(getTyoe(),getName(),getMC(),getCost());
    }
}
