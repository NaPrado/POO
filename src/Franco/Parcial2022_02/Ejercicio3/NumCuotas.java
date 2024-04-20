package Franco.Parcial2022_02.Ejercicio3;

import java.time.LocalDate;
import java.util.Date;

public class NumCuotas extends CantCuotas{
    NumCuotas(double amount, LocalDate fecha, int cantCuotas, Destinatario dest) throws LoanException {
        super(amount, fecha, cantCuotas, dest);
    }

    @Override
    void pay(int numCuota, LocalDate fechaDePago) throws LoanException {
        super.pay(numCuota, fechaDePago);
    }
}
