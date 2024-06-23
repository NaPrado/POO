package RecuPrimerParcial.Rec1_22_01.Ej2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class DeparturesCentral implements Iterable<Departure>{
    private static final int INTI_DIM=10;
    private Departure [] departures=new Departure [INTI_DIM];
    private int sp=0;
    private void resize(){
        departures=Arrays.copyOf(departures,departures.length+INTI_DIM);
    }
    public DeparturesCentral addDeparture(String id, LocalDate date){
        if(sp == departures.length ){
            resize();
        }
        departures[sp++]=new Departure(id,date);
        return this;
    }
    public Departure getDepartureByIndex(int index){
        if (index < 0 || index >= sp){
            throw new RuntimeException("Error");
        }
        return departures[index];
    }

    public Departure[] departures() {
        return Arrays.copyOf(departures, sp);
    }
    public Departure[] departures(Comparator<Departure> comparator) {
        Departure[] ret= departures();
        Arrays.sort(ret, comparator);
        return ret;
    }
    public Iterator<Departure> iterator(){
        Departure [] toIt=Arrays.copyOf(departures, sp);
        return new Iterator<Departure>() {
            int i=0;
            @Override
            public boolean hasNext() {
                return i < toIt.length;
            }

            @Override
            public Departure next() {
                if (!hasNext()){
                    throw new RuntimeException();
                }
                return toIt[i++];
            }
        };
    }
}
