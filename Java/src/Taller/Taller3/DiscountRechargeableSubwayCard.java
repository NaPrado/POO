package Taller.Taller3;

public class DiscountRechargeableSubwayCard extends RechargeableSubwayCard{
    private double discountPercentage;
    public DiscountRechargeableSubwayCard(SubwayCentral sc, double discountPercentage){
        super(sc);
        this.discountPercentage=discountPercentage;
    }

    @Override
    protected double rideCost() {
        return super.rideCost()*((100-discountPercentage)/100);
    }
}
