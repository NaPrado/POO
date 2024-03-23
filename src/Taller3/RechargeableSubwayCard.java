package Taller3;

public class RechargeableSubwayCard extends SubwayCard{
    private double balance;
    RechargeableSubwayCard(SubwayCentral sc){
        super(sc);
    }
    public void recharge(double amount){
        balance+=amount;
    }
    protected double rideCost(){
        return subwayCentral.getRideCost();
    }

    @Override
    protected boolean cantRide() {
        return !((balance - subwayCentral.rideCost) < 0);
    }

    @Override
    public void ride() throws CannotRideException {
        if (cantRide()){
            throw new CannotRideException();
        }
        balance-=subwayCentral.rideCost;
    }
}
