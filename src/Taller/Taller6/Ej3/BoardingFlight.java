package Taller.Taller6.Ej3;

import java.util.*;

public abstract class BoardingFlight {
    private SortedSet<Passenger> passengers;
    public BoardingFlight(Comparator<Passenger> cmp){
        passengers = new TreeSet<>(cmp);
    }
    public void addForBoarding(String name, int seat, PassengerCategory cat){
        passengers.add(new Passenger(name,seat,cat));
    }

    Iterator<String> boardingCallIterator(){
        return new Iterator<String>() {
            Iterator<Passenger> passengerIterator = passengers.iterator();
            @Override
            public boolean hasNext() {
                return passengerIterator.hasNext();
            }

            @Override
            public String next() {
                if (!hasNext()){
                    throw new NoSuchElementException();
                }
                return passengerIterator.next().toString();
            }
        };
    }
}
