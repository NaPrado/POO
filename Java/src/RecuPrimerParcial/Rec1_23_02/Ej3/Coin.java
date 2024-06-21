package RecuPrimerParcial.Rec1_23_02.Ej3;

import Guias.TP2.Ej3.Ej3;

public abstract class Coin{
    private String name, pais;
    private Integer year;
    Coin(String name, String pais, Integer year){
        this.name = name;
        this.pais = pais;
        this.year = year;
    }

    @Override
    public String toString() {
        return "%s of %s minted in %d".formatted(name,pais,year);
    }

    public Integer getYear() {
        return year;
    }

    public String getPais() {
        return pais;
    }
}
