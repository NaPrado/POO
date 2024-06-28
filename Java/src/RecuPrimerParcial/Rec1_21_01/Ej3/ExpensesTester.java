package RecuPrimerParcial.Rec1_21_01.Ej3;

public class ExpensesTester {
    public static void main(String[] args) {
        // Obtengo un nuevo consorcio con los valores por defecto
        // $100 = Costo por metro cuadrado U.F. Residencial y Comercial
        // 3.0  = Multiplicador U.F. Comercial
        // El consorcio inicia sin amenities
        Building building = new Building();

        // Obtengo una U.F. Residencial de nombre "101", de 35 m2 y 2 ambientes
        FunctionalUnit aHouse = building.newResidentialFunctionalUnit("101", 35, 2);
        System.out.println("----------");

        // Expensas para 101 = (35m2 * $100) * 2amb = 3500 * 2 = $7000
        System.out.println(aHouse); //Residencial: U.F. 101 ( 35 m2 ) : $7000,00
        System.out.println("----------");

        // $150 = Costo por metro cuadrado U.F. Residencial y Comercial
        building.setM2Expense(150.0);
        System.out.println("----------");

        // Expensas para 101 = (35m2 * $150) * 2amb = 5250 * 2 = $10500
        System.out.println(aHouse);
        System.out.println("----------");

        // Obtengo una U.F. Comercial de nombre "C70", de 20 m2
        FunctionalUnit aStore = building.newCommercialFunctionalUnit("C70", 20);
        System.out.println("----------");

        // Expensas para C70 = (20m2 * $150) * 3 = 3000 * 3 = $9000
        System.out.println(aStore);
        System.out.println("----------");

        // 5.0  = Multiplicador U.F. Comercial
        building.setCommercialMult(5.0);
        System.out.println("----------");

        // Expensas para C70 = (20m2 * $150) * 5 = 3000 * 5 = $15000
        System.out.println(aStore);
        System.out.println("----------");

        // Se setean las amenities de Limpieza, Fumigación y Piscina
        building.setAmenities(new Amenity[]{Amenity.CLEANING, Amenity.FUMIGATION, Amenity.POOL});
        System.out.println("----------");

        // Expensas para C70 = (20m2 * $150) * 5 = 3000 * 5 = $15000
        System.out.println(aStore);
        System.out.println("----------");

        // Expensas para 101 = (35m2 * $150) * 2amb + ( Limpieza + Fumigación + Piscina ) =
        //                              5250 * 2    + ( $300 * 2amb + $100 * 2amb + 200 ) =
        //                                10500     + (      600    +     200     + 200 ) =
        //                                10500     +                 1000                = $11500
        System.out.println(aHouse);

        // Se setean las amenities de Limpieza y Piscina
        building.setAmenities(new Amenity[]{Amenity.CLEANING, Amenity.POOL});
        System.out.println("----------");

        // Expensas para C70 = (20m2 * $150) * 5 = 3000 * 5 = $15000
        System.out.println(aStore);
        System.out.println("----------");

        // Expensas para 101 = (35m2 * $150) * 2amb + ( Limpieza + Piscina ) =
        //                              5250 * 2    + ( $300 * 2amb + 200  ) =
        //                                10500     + (      600    + 200  ) =
        //                                10500     +            800         = $11300
        System.out.println(aHouse);
    }

}
