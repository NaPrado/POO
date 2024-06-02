package Guias.TP7.Ej4;

import java.util.*;

public class Ranker {
    Set<RankedBook> rankedBooks=new HashSet<>();
    Ranker add(Genre genero,Book libro){
        rankedBooks.add(new RankedBook(libro,genero));
        return this;
    }
    void rateUp(Book libro){
        boolean found=false;
        Iterator<RankedBook> it =rankedBooks.iterator();
        while (it.hasNext() && !found){
            RankedBook book=it.next();
            if (book.libro.equals(libro)){
                it.remove();
                rankedBooks.add(new RankedBook(book));
                found=true;
            }
        }
        if (!found){
            rankedBooks.add(new RankedBook(libro));
        }
    }
    void printRanking(){
        System.out.println("General Ranking");
        for (RankedBook elm: rankedBooks){
            System.out.println(elm);
        }
    }
    void printRanking(Genre genero){
        System.out.println("Ranking of " + genero);
        for (RankedBook elm: rankedBooks){
            if (genero.equals(elm.genre)){
                System.out.println(elm);
            }
        }
    }
}
