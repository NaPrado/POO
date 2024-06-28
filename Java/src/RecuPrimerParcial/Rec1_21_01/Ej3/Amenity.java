package RecuPrimerParcial.Rec1_21_01.Ej3;

public enum Amenity {
    CLEANING(300),
    FUMIGATION(100),
    POOL(200);
    int cost;
    Amenity(int cost){
        this.cost = cost;
    }
    public int getCost(int amb){
        if (this == POOL){
            return cost;
        }
        return amb*cost;
    }
}
