package Guias.TP7.Ej4;

import java.util.Objects;

public class Book implements Comparable<Book>{

    String title,author;
    Book(String title, String author){
        this.title=title;
        this.author=author;
    }

    @Override
    public int compareTo(Book o) {
        int cmp=title.compareTo(o.title);
        if(cmp==0){
            cmp=author.compareTo(o.author);
        }
        return cmp;
    }

    @Override
    public String toString() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Book that &&
                title.equals(that.title) &&
                author.equals(that.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title,author);
    }
}
