package Franco.Parcial2022_02.Ejercicio1;

import java.time.LocalDate;
import java.util.Comparator;

public class TVEpisode implements Comparable<TVEpisode>{
    private final int id;
    private final String title;
    private final double rating;
    private final LocalDate airedDate;

    public TVEpisode(int id, String title, double rating, LocalDate airedDate) {
        this.id = id;
        this.title = title;
        this.rating = rating;
        this.airedDate = airedDate;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getRating() {
        return rating;
    }
    public LocalDate getAiredDate() {
        return airedDate;
    }

    @Override
    public int compareTo(TVEpisode o) {
        return Integer.compare(this.id,o.id);
    }

    @Override
    public String toString() {
        return "(%d) Episode %s aired on %s has %.2f rating".formatted(id,title,airedDate,rating);
    }
}

