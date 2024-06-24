package RecuPrimerParcial.Rec1_21_02.Ej3;

public class MemberCard extends DiscountCard {
    private double points;
    MemberCard(String id,SaraCenter sc) {
        super(id,sc);
    }

    @Override
    public double checkPrice(Product p) {
        if (p.getPrice()>points){
            return (1- sc.getMemberDiscount())*p.getPrice();
        }
        return 0;
    }

    @Override
    public void buyProduct(Product p) {
        if (checkPrice(p)==0){
            points-=p.getPrice();
            return;
        }
        points+=p.getPrice()*0.5;
        super.buyProduct(p);
    }

    @Override
    public String toString() {
        return "Member"+super.toString()+" has %.2f points".formatted(points);
    }
}
