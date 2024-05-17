package Taller.Taller8.Ej3;

import java.util.NoSuchElementException;

public class SpecialCollectionTest {

    public static void main(String[] args) {
        SpecialCollection<Integer> sc = new SpecialCollectionImpl<>();

        System.out.println(sc.isEmpty()); // Imprime true

        try {
            sc.deleteFirst();
        } catch (NoSuchElementException ex) {
            System.out.println("Nothing to delete"); // Imprime Nothing to delete
        }

        sc.add(20);
        sc.add(30);
        sc.add(10);
        sc.add(30); // No lo agrega porque la colección no acepta repetidos

        System.out.println(sc.size()); // Imprime 3

        for(Integer element : sc) {
            System.out.println(element); // Imprime 30 20 10
        }

        sc.deleteFirst(); // Se elimina el primer elemento (30)

        for(Integer element : sc) {
            System.out.println(element); // Imprime 20 10
        }

        // Se elimina el primer elemento (20) si la condición recibida por parámetro
        // se cumple. No se cumple pues la condición es impar y el 20 no lo es.
        sc.deleteFirst(first -> first % 2 == 1);

        for(Integer element : sc) {
            System.out.println(element); // Imprime 20 10
        }

        // Se elimina el primer elemento (20) si la condición recibida por parámetro
        // se cumple. Se cumple pues la condición es par y el 20 sí lo es.
        sc.deleteFirst(first -> first % 2 == 0);

        for(Integer element : sc) {
            System.out.println(element); // Imprime 10
        }

        sc.undoDeleteFirst(); // Se deshace la eliminación del 20

        for(Integer element : sc) {
            System.out.println(element); // Imprime 20 10
        }

        sc.undoDeleteFirst(); // Se deshace la eliminación del 30

        for(Integer element : sc) {
            System.out.println(element); // Imprime 30 20 10
        }

        try {
            sc.undoDeleteFirst();
        } catch (NothingToUndoException ex) {
            // Se arroja un error porque no hay operación para deshacer
            System.out.println(ex.getMessage()); // Imprime Nothing to undo
        }
    }

}

