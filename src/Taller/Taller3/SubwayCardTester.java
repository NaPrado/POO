package Taller.Taller3;

public class SubwayCardTester {

    public static void main(String[] args) throws CannotRideException {
        SubwayCentral sc = new SubwayCentral(25);

        FixedSubwayCard fsc = new FixedSubwayCard(sc, 2);
        try {
            fsc.ride();
            fsc.ride();
            fsc.ride(); // Imprime un mensaje de error
        }catch (CannotRideException ex){
            System.err.println(ex.getMessage());
        }

        try{
            RechargeableSubwayCard rsc = new RechargeableSubwayCard(sc);
            rsc.recharge(50);
            rsc.ride();
            sc.setRideCost(30);
            rsc.ride(); // Imprime un mensaje de error
        }catch (CannotRideException ex){
            System.err.println(ex.getMessage());
        }
        try{
            DiscountRechargeableSubwayCard drsc = new DiscountRechargeableSubwayCard(sc, 0.50);
            drsc.recharge(30);
            drsc.ride();
            drsc.ride();
            drsc.ride(); // Imprime un mensaje de error
        }catch (CannotRideException ex){
            System.err.println(ex.getMessage());
        }
    }

}