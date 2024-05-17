package Guias.TP5.Ej12;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class LocalDateInterval implements Iterable<LocalDate> {
    LocalDate startDate;
    LocalDate endDate;
    int interval;
    LocalDateInterval(LocalDate start, LocalDate end, int interval){
        this.startDate = start;
        this.endDate = end;
        this.interval = interval;
    }

    @Override
    public Iterator<LocalDate> iterator() {
        return new Iterator<LocalDate>() {
            LocalDate current = startDate;
            @Override
            public boolean hasNext() {
                return interval > 0 && !current.isAfter(endDate) || interval < 0 && !current.isBefore(endDate);
            }
            @Override
            public LocalDate next() {
                if(!hasNext()){
                    throw new NoSuchElementException();
                }
                LocalDate aux=current;
                current=current.plusDays(interval);
                return aux;
            }
        };
    }
}
