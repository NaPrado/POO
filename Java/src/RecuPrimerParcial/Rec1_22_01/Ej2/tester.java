package RecuPrimerParcial.Rec1_22_01.Ej2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class tester {
    public static void main(String[] args) {
        DeparturesCentral dc = new DeparturesCentral();

    // Se registra un despegue del vuelo AA954 el 23/06/2022
        dc.addDeparture("AA954", LocalDate.of(2022, 6, 23));

        dc.addDeparture("AR1302", LocalDate.of(2022, 6, 22))
                .addDeparture("AA954", LocalDate.of(2022, 6, 22));

    // Se obtiene el primer despegue registrado (por orden de inserción)
        Departure firstDep = dc.getDepartureByIndex(0);
        System.out.println(firstDep); // (AA954, 2022-06-23)

    // Arroja un error porque se intenta obtener el cuarto despegue registrado
    // (por orden de inserción) y sólo se registraron tres
        try {
            dc.getDepartureByIndex(3);
        } catch (Exception ex) {
            System.out.println("Error"); // Error
        }

    // Se obtiene una copia de los despegues registrados en orden cronológico
    // y desempata alfabéticamente por código de vuelo
    // y se imprimen en pantalla
        System.out.println(Arrays.toString(dc.departures()));
    // [(AA954, 2022-06-22), (AR1302, 2022-06-22), (AA954, 2022-06-23)]

        dc.addDeparture("AC91", LocalDate.of(2022, 6, 24));

    // Se obtiene una copia de los despegues registrados en orden alfabético
    // por código de vuelo y desempata en orden cronológico descendente
    // y se imprimen en pantalla
        System.out.println(Arrays.toString(dc.departures(new Comparator<Departure>() {
            @Override
            public int compare(Departure o1, Departure o2) {
                int ret= o1.getId().compareTo(o2.getId());
                if (ret==0){
                    ret=o2.getDate().compareTo(o1.getDate());
                }
                return ret;
            }
        })));
    // [(AA954, 2022-06-23), (AA954, 2022-06-22), (AC91, 2022-06-24), (AR1302, 2022-06-22)]

    // Se imprimen en pantalla todos los despegues registrados en orden de inserción
        for(Departure departure : dc) {
            System.out.println(departure);
        }
    // (AA954, 2022-06-23)
    // (AR1302, 2022-06-22)
    // (AA954, 2022-06-22)
    // (AC91, 2022-06-24)

    }
}
