package RecuPrimerParcial.Rec1_23_01.Ej3;

public abstract class Pase {
    int rides;
    @Override
    public String toString(){
        return "Bike Pass used " + rides + " times";
    }
    void ride(BikeType tipo){
        if (!tipo.canRide(rides)){
            throw new CannotRideBikeException();
        }
        rides++;
    }
}
