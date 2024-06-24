package RecuPrimerParcial.Rec1_21_02.Ej3;

public class HolidayCard extends DiscountCard{
    HolidayCard(String id,SaraCenter sc){
        super(id,sc);
    }
    @Override
    public double checkPrice(Product p){
        return (1- sc.getHolidayDiscount())*p.getPrice();
    }

    @Override
    public String toString() {
        return "Holiday"+super.toString();
    }
}
