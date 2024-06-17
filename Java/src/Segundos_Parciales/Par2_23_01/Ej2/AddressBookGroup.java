package Segundos_Parciales.Par2_23_01.Ej2;

public class AddressBookGroup implements Comparable<AddressBookGroup> {
    private final String name;
    public AddressBookGroup(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(AddressBookGroup o) {
        return this.name.compareTo(o.name);
    }
}
