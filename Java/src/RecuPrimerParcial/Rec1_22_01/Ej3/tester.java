package RecuPrimerParcial.Rec1_22_01.Ej3;

import java.util.function.Function;

public class tester {
    public static void main(String[] args) {
        // Se modela una promoción que no cambia la cantidad variable de puntos
        Function<Double, Double> noPromotion = new Function<Double, Double>() {
            @Override
            public Double apply(Double originalPoints) {
                return originalPoints;
            }
        };

// Se crea una central seteando la promoción definida
        CoffeeRewards arCentral = new CoffeeRewards(noPromotion);

// Se crea una tarjeta de tipo WELCOME para el cliente Mike
        CoffeeCard c1 = arCentral.buildCard("Mike", CardType.WELCOME);
        System.out.println(c1); // CoffeeCard 1001 from Mike with 0 points
// Se registra una compra de $100
        c1.purchase(100.0); // $100 suman $100 x 10 = 1000 pts
        c1.purchase(200.0); // $200 suman $200 x 10 = 2000 pts
        System.out.println(c1); // CoffeeCard 1001 from Mike with 3000 points

// Se modela una promoción que duplica la cantidad variable de puntos
        Function<Double, Double> doublePointsPromotion = new Function<Double, Double>() {
            @Override
            public Double apply(Double originalPoints) {
                return originalPoints * 2;
            }
        };
        arCentral.setPointsPromotion(doublePointsPromotion);

        c1.purchase(300.0); // $300 suman ($300 x 10) x 2 = 6000 pts
        System.out.println(c1); // CoffeeCard 1001 from Mike with 9000 points


// Se crea una tarjeta de tipo GREEN para el cliente Lisa
        CoffeeCard c2 = arCentral.buildCard("Lisa", CardType.GREEN);
        c2.purchase(100.0); // $100 suman (($100 x 30) x 2) + 5 = 6005 pts
        System.out.println(c2); // CoffeeCard 1002 from Lisa with 6005 points

// Se vuelve a setear la promoción que no cambia la cantidad variable de puntos
        arCentral.setPointsPromotion(noPromotion);

        c2.purchase(200.0); // $200 suman ($200 x 30) + 5 = 6005 pts
        System.out.println(c2); // CoffeeCard 1002 from Lisa with 12010 points

        CoffeeRewards brCentral = new CoffeeRewards(noPromotion);
// Se crea una tarjeta de tipo GOLD para el cliente Adam
        CoffeeCard c3 = brCentral.buildCard("Adam", CardType.GOLD);
        System.out.println(c3); // CoffeeCard 1003 from Adam with 0 points
    }
}
