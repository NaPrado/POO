package Taller.Taller6.Ej3;

import java.util.Objects;

public class Passenger{
    private final String nombre;
    private int seat;
    PassengerCategory cat;
    public Passenger(String nombre, int seat, PassengerCategory cat) {
        this.nombre = nombre;
        this.seat = seat;
        this.cat = cat;
    }

    public int getSeat() {
        return seat;
    }

    public PassengerCategory getCat() {
        return cat;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return getNombre();
    }

    /*
    No hace falta, se define con compareTo()
    @Override
    public boolean equals(Object obj) {
        return this==obj||(obj instanceof Passenger p &&
                p.nombre.equals(this.nombre) &&
                p.seat == this.seat &&
                p.cat.equals(this.cat));
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre,seat,cat);
    }*/
}
