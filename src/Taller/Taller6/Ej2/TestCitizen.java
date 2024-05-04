package Taller.Taller6.Ej2;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestCitizen {
    public static void main(String[] args) {
        SortedSet<Citizen> citizens1 = new TreeSet<>();
        citizens1.add(new Citizen(44361965,"Nahuel","Prado"));
        citizens1.add(new Citizen(44361965,"Nahuel","Prado"));
        citizens1.add(new Citizen(46025282,"Luana","Percich"));
        System.out.println(citizens1);
        SortedSet<Citizen> citizens2 = new TreeSet<>((o1, o2) -> o2.getDNI() - o1.getDNI());
        citizens2.add(new Citizen(44361965,"Nahuel","Prado"));
        citizens2.add(new Citizen(44361965,"Nahuel","Prado"));
        citizens2.add(new Citizen(46025282,"Luana","Percich"));
        System.out.println(citizens2);
    }
}
