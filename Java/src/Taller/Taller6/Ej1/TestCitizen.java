package Taller.Taller6.Ej1;

import java.util.HashSet;
import java.util.Set;

public class TestCitizen {
    public static void main(String[] args) {
        Set<Citizen> citizens = new HashSet<>();
        citizens.add(new Citizen(44361965,"Nahuel","Prado"));
        citizens.add(new Citizen(44361965,"Nahuel","pepe"));
        citizens.add(new Citizen(46025282,"Luana","Percich"));
        System.out.println(citizens);
    }
}
