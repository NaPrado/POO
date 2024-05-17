package Franco.Parcial2022_02.Ejercicio3;

public enum Destinatario {
    PERSONAL(50000, 12),
    VEHICLE(300000, 24),
    HOME(1000000, 360);
    private final double maxAmount;
    private final int maxCuotas;
    Destinatario(double maxAmount, int maxCuotas){
        this.maxAmount=maxAmount;
        this.maxCuotas=maxCuotas;
    }
    public boolean isValid(double amount, int cuotas){
        return amount < maxAmount && cuotas < maxCuotas;
    }
}
