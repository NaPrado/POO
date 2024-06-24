package RecuPrimerParcial.Rec1_21_02.Ej1;

import java.util.Iterator;
import java.util.function.Predicate;

public class tester {
    public static void main(String[] args) {
        /**
         * Ejemplo 1.1: Arreglo de String y ningún predicado para que el "match" lo
         * tengan todos los elementos
         */
        String[] v1 = {"Hello", "World", "Hola", "Mundo"};
        MatchCollection<String> mc1 = new MatchCollection<>(v1);
        Iterator<MatchElement<String>> it1 = mc1.iterator();

        /**
         * Ejemplo 1.2: Arreglo de String y una condición para que el "match" lo
         * tengan los strings que comiencen con una H
         */
        Predicate<String> p1 = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("H");
            }
        };
        mc1.setCondition(p1);
        Iterator<MatchElement<String>> it2 = mc1.iterator();
        System.out.println("----------");

        while(it1.hasNext()) {
            MatchElement<String> e1 = it1.next();
            System.out.println(e1);
        }
        try {
            it1.next();
        } catch (Exception ex) {
            System.out.println("No more elements.");
        }
        System.out.println("----------");

        while(it2.hasNext()) {
            MatchElement<String> e2 = it2.next();
            System.out.println(e2);
        }
        try {
            it2.next();
        } catch (Exception ex) {
            System.out.println("No more elements.");
        }
        System.out.println("----------");

        /**
         * Ejemplo 2.1: Arreglo de enteros y una condición para que el "match" lo
         * tengan los enteros pares
         */
        Integer[] v2 = {2, 3, 5, 6, 8};
        MatchCollection<Integer> mc2 = new MatchCollection<>(v2, n -> n % 2 == 0);
        for(MatchElement<Integer> me : mc2) {
            System.out.println(me.matches());
        }
        System.out.println("----------");

        /**
         * Ejemplo 2.2: Arreglo de enteros y una condición para que el "match" lo
         * tengan los enteros impares
         */
        mc2.setCondition(n -> n % 2 == 1);
        for(MatchElement<Integer> me : mc2) {
            System.out.println(me.matches());
        }
        System.out.println("----------");
    }

}
