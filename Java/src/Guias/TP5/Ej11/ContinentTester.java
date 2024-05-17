package Guias.TP5.Ej11;

import java.util.Arrays;

public class ContinentTester {

    public static void main(String[] args) {
        Continent[] continents = new Continent[]{
                Continent.OCEANIA,
                Continent.AMERICA,
                Continent.EUROPE};
        Arrays.sort(continents,(o1,o2)->{return Integer.compare(o1.getPopulation() , o2.getPopulation());});
        for(Continent continent : continents) {
            System.out.println(continent);
        }
    }

}
