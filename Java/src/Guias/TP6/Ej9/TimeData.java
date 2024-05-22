package Guias.TP6.Ej9;

import java.util.Objects;

public class TimeData <T>{
    private T elem;
    int hours,minutes;
    TimeData(T elem, int hours, int minutes){
        this.elem = elem;
        this.hours = hours;
        this.minutes = minutes;
    }
    TimeData(T elem){
        this.elem = elem;
    }
    public T getElem(){
        return elem;
    }

    @Override
    public boolean equals(Object obj) {
        return this==obj||(obj instanceof TimeData tD &&
                tD.elem.equals(this.elem));
    }

    @Override
    public int hashCode() {
        return Objects.hash(elem);
    }
    public boolean between(int hoursFrom, int minutesFrom, int hoursTo, int minutesTo){
        return (hours > hoursFrom || hours == hoursFrom && minutes >= minutesFrom) &&
                (hours < hoursTo || hours == hoursTo && minutes <= minutesTo);
    }
}
