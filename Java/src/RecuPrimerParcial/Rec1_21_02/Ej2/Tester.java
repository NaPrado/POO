package RecuPrimerParcial.Rec1_21_02.Ej2;

import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        School school = new School();
        // Se contrata a Teacher 1 como Docente Full-Time y 3 años de antigüedad
        school.hireEmployee("Teacher 1", 3, Type.FT);
        // Se contrata a Teacher 2 como Docente Part-Time y 5 años de antigüedad
        school.hireEmployee("Teacher 2", 5, Type.PT);
        // Se contrata a Teacher 3 como Docente Part-Time y 2 años de antigüedad
        school.hireEmployee("Teacher 3", 2, Type.PT);
        // Se contrata a Director 1 como Director y 2 años de antigüedad
        school.hireEmployee("Director 1", 3, Type.D);
        System.out.println("----------");
        // Se calcula el sueldo de Teacher 1 por 10 horas de trabajo
        // Sueldo = Horas * $ Hora Full-Time + Antigüedad * $ Antigüedad Full-Time
        // Sueldo =   10  *      $200        +      3     *         $10            = $2030
        System.out.println(school.getSalary("Teacher 1", 10));
        // Se calcula el sueldo de Teacher 2 por 6 horas de trabajo
        // Sueldo = Horas * $ Hora Part-Time
        // Sueldo =   6   *      $100         = $600
        System.out.println(school.getSalary("Teacher 2", 6));
        // Se calcula el sueldo de Director 1 por 10 horas de trabajo
        // Sueldo = Horas * $ Hora Director + Antigüedad * $ Antigüedad Director
        // Sueldo =   10  *      $300       +      3     *         $20          = $3060
        System.out.println(school.getSalary("Director 1", 10));
        System.out.println("----------");
        // Obtiene una copia de los empleados de la escuela
        // por orden ascendente por antigüedad y desempata descendente por nombre
        System.out.println(Arrays.toString(school.employees()));
        System.out.println("----------");
        // Se contrata a Teacher 4 como Docente Full-Time y 30 años de antigüedad
        school.hireEmployee("Teacher 4", 30, Type.FT);
        System.out.println("----------");
        // Obtiene una copia de los empleados de la escuela
        // por orden ascendente por antigüedad y desempata descendente por nombre
        System.out.println(Arrays.toString(school.employees()));
        System.out.println("----------");
        try {
            // Se obtiene un error pues se intenta calcular el sueldo de un empleado inexistente
            System.out.println(school.getSalary("Hello", 10));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
