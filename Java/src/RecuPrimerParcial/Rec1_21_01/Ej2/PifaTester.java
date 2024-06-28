package RecuPrimerParcial.Rec1_21_01.Ej2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class PifaTester {

    public static void main(String[] args) {
        // Ejemplo de Uso de LocalDate
        LocalDate test = LocalDate.of(2021, 3, 29);
        System.out.println(test);
        System.out.println("**********************");

        // Nuevo sistema de registro de facturas
        Pifa pifa = new Pifa();

        // Se agrega al sistema una factura con el cuit 23759374010, la fecha 2021-03-27
        // y monto $3540,00. Se le asigna el número 1001 a esta nueva factura
        pifa.generateBill("23759374010", LocalDate.of(2021, 3, 27), 3540.00);
        System.out.println("**********************");

        // Se agrega al sistema una factura con el cuit 20538207421, la fecha 2021-03-27
        // y monto $1259,50. Se le asigna el número 1002 a esta nueva factura
        pifa.generateBill("20538207421", LocalDate.of(2021, 3, 27), 1259.50);
        System.out.println("**********************");

        // Se agrega al sistema una factura con el cuit 23759374010, la fecha 2021-05-13
        // y monto $2870,60. Se le asigna el número 1003 a esta nueva factura
        pifa.generateBill("23759374010", LocalDate.of(2021, 5, 13), 2870.60);
        System.out.println("**********************");

        // Orden natural: descendente por fecha y desempata ascendente por total
        Bill[] billsByDateDesc = pifa.getBills();
        System.out.println(Arrays.toString(billsByDateDesc));
        System.out.println("**********************");

        // Orden: ascendente por fecha y desempata ascendente por cuit
        Bill[] billsByDateAsc = pifa.getBills(new Comparator<Bill>() {
            @Override
            public int compare(Bill o1, Bill o2) {
                int ret= o1.getFecha().compareTo(o2.getFecha());
                if (ret==0){
                    ret= o1.getCuit().compareTo(o2.getCuit());
                }
                return ret;
            }
        });
        System.out.println(Arrays.toString(billsByDateAsc));
        System.out.println("**********************");

        // Orden: descendente por cuit y desempata descendente por total
        Bill[] billsByCuitAsc = pifa.getBills(new Comparator<Bill>(){
            @Override
            public int compare(Bill o1, Bill o2) {
                int ret= o2.getCuit().compareTo(o1.getCuit());
                if (ret==0){
                    ret= Double.compare(o2.getMonto(), o1.getMonto());
                }
                return ret;
            }
        });
        System.out.println(Arrays.toString(billsByCuitAsc));
        System.out.println("**********************");

        Pifa emptyPifa = new Pifa();
        try {
            // Se obtiene un error porque no hay facturas emitidas
            emptyPifa.getBills();
        } catch (NoBillsException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("**********************");
    }

}


