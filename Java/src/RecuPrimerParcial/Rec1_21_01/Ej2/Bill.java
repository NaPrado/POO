package RecuPrimerParcial.Rec1_21_01.Ej2;


import java.time.LocalDate;

public class Bill implements Comparable<Bill> {
    private int id;
    private String cuit;
    private LocalDate fecha;
    private double monto;
    Bill(int id, String cuit, LocalDate fecha, double monto){
        this.id = id;
        this.cuit = cuit;
        this.fecha = fecha;
        this.monto = monto;
    }
    public int getId() {
        return id;
    }
    public String getCuit() {
        return cuit;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public double getMonto() {
        return monto;
    }

    @Override
    public int compareTo(Bill o) {
        int ret= o.getFecha().compareTo(fecha);
        if(ret==0){
            ret=Double.compare(monto, o.monto);
        }
        return ret;
    }
    @Override
    public String toString(){
        return "## Bill %d # Cuit %s # Date %s # Amount $%.2f ###".formatted(id, cuit, fecha.toString(), monto);
    }
}
