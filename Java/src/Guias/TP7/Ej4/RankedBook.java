package Guias.TP7.Ej4;

import java.util.Comparator;
import java.util.Objects;

public class RankedBook implements Comparable<RankedBook>{
    Book libro;
    Genre genre;
    int rank;
    RankedBook(Book libro, Genre genre) {
        this.libro = libro;
        this.genre = genre;
    }
    RankedBook(Book libro){
        this.libro = libro;
        this.rank=1;
    }
    RankedBook(RankedBook rankedBook){
        this.libro = rankedBook.libro;
        this.genre = rankedBook.genre;
        this.rank = rankedBook.rank+1;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof RankedBook that &&
                libro.equals(that.libro) &&
                genre==that.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(libro, genre);
    }

    @Override
    public String toString() {
        return "%s :%d".formatted(libro, rank);
    }

    @Override
    public int compareTo(RankedBook o) {
        int cmp=Integer.compare(rank,o.rank);
        if (cmp==0){
            return libro.compareTo(o.libro);
        }
        return cmp;
    }
}
