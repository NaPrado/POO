package RecuPrimerParcial.Rec1_22_01.Ej3;

import RecuPrimerParcial.Rec1_23_01.Ej1.C;

public class CoffeeCard {
    private String name;
    private CardType type;
    private int id;
    private double points=0;
    private CoffeeRewards central;
    CoffeeCard(String name,CardType type, int id, CoffeeRewards central){
        this.name=name;
        this.type=type;
        this.id=id;
        this.central=central;
    }
    public void purchase(double amount){
        points=type.getPoints(amount,points,central.prom);
    }

    @Override
    public String toString(){
        return "CoffeeCard " + id + " from " + name + " with " + points +" points";
    }
}
