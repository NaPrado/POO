package Guias.TP6.Ej9;

import java.util.HashSet;
import java.util.Set;

public class TimeSetImpl<T> implements TimeSet<T>{
    private Set<TimeData<T>> set=new HashSet<TimeData<T>>();
    @Override
    public void add(T elem, int hours, int minutes) {
        TimeData<T> NewTD=new TimeData<>(elem, hours, minutes);
        set.add(NewTD);
    }

    @Override
    public void remove(T elem) {
        set.remove(new TimeData<>(elem));
    }

    @Override
    public int size() {
        return set.size();
    }

    @Override
    public boolean contains(T elem) {
        return set.contains(new TimeData<>(elem));
    }

    @Override
    public Set<T> retrieve(int hoursFrom, int minutesFrom, int hoursTo, int minutesTo) {
        Set<T> ret=new HashSet<>();
        for(TimeData<T> t:set){
            if(t.between(hoursFrom,minutesFrom,hoursTo,minutesTo)){
                ret.add(t.getElem());
            }
        }
        return ret;
    }
}
