package Franco.Parcial2021_01.Ejercicio2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayTVCatalog implements TVCatalog {
    private TVShow[] shows =new TVShow[INITIAL_DIM];
    private static final int INITIAL_DIM = 5;
    private int dim;

    private void resize(){
        shows = Arrays.copyOf(shows,dim+shows.length);
    }

    @Override
    public TVCatalog addTVShow(String name, double rating) {
        return null;
    }

    @Override
    public void setRatingRange(double min, double max) {

    }

    @Override
    public Iterator<TVResponse> iterator() {
        return new Iterator<TVResponse>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public TVResponse next() {
                return null;
            }
        };
    }
}
