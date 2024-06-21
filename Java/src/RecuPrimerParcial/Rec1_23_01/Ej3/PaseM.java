package RecuPrimerParcial.Rec1_23_01.Ej3;

public class PaseM extends Pase{
    int balance=0;
    String name;
    @Override
    void ride(BikeType tipo){
        super.ride(tipo);
        balance = balance + tipo.getCost();
    }
    public PaseM(String name){
        this.name=name;
    }
    @Override
    public String toString(){
        return "Member "+super.toString()+" for "+name+" with "+balance+" balance" ;
    }
}
