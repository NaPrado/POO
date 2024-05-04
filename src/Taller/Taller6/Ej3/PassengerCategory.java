package Taller.Taller6.Ej3;

public enum PassengerCategory {
    EMERALD,
    SAPPHIRE,
    RUBY,
    ECONOMY;

    @Override
    public String toString() {
        return this.name();
    }
}
