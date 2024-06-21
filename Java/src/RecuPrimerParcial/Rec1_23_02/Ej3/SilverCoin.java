package RecuPrimerParcial.Rec1_23_02.Ej3;

public class SilverCoin extends Coin {

    SilverCoin(String name, String pais, Integer year) {
        super(name, pais, year);
    }

    @Override
    public String toString() {
        return "Silver "+super.toString();
    }
}
