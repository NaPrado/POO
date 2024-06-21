package RecuPrimerParcial.Rec1_23_02.Ej3;

public class GoldCoin extends SilverCoin{
    Integer karats;
    GoldCoin(String name, String pais, Integer year, Integer karats){
        super(name,pais,year);
        this.karats = karats;
    }

    @Override
    public String toString() {
        return "Gold "+super.toString()+" with "+karats+" karats";
    }
}
