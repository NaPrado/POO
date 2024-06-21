package RecuPrimerParcial.Rec1_23_01.Ej3;

public enum BikeType {
    CLASSIC(100, 0),
    ELCTRICT(150,3);
    int cost,minToRide;
    BikeType(int cost, int minToRide) {
        this.cost = cost;
        this.minToRide = minToRide;
    }
    public boolean canRide(int rides){
        return rides >= minToRide;
    }
    public int getCost() {
        return cost;
    }
}
