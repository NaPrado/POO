package Taller.Taller6.Ej1;

import java.util.Objects;
import java.util.Set;

public class Citizen {
    int DNI;
    String nombre;
    String apellido;
    Citizen(int DNI, String nombre, String apellido) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Citizen)) {
            return true;
        }
        return (Integer.compare(DNI, ((Citizen) obj).DNI) == 0) &&
                (nombre.equals(((Citizen) obj).nombre)) &&
                (apellido.equals(((Citizen) obj).apellido));
    }

    @Override
    public String toString() {
        return "\nCiudadano: " + "\nDNI:" + DNI + "\nNombre:" + nombre + " " + apellido;
    }

    @Override
    public int hashCode() {
        return Objects.hash(DNI, nombre, apellido);
    }
}
