package RecuPrimerParcial.Rec1_23_01.Ej3;

public class PaseV extends Pase{
    int maxRides;
    PaseV(int maxRides){
        this.maxRides = maxRides;
    }

    @Override
    void ride(BikeType tipo) {
        super.ride(tipo);
        if (maxRides == rides) {
            throw new CannotRideBikeException();
        }
    }
    @Override
    public String toString(){
        return "Visitor" + super.toString() + "with " + maxRides + " max rides";
    }
}
