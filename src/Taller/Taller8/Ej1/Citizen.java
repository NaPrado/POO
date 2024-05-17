package Taller.Taller8.Ej1;

public class Citizen {
    private int dni;
    private String name;
    private String surname;

    public Citizen(int dni, String name, String surname){
        this.name = name;
        this.surname = surname;
        this.dni = dni;
    }

    public int getDni() {
        return dni;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "dni=" + dni +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
