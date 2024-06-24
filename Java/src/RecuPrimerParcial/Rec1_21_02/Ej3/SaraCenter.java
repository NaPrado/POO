package RecuPrimerParcial.Rec1_21_02.Ej3;

public class SaraCenter {
    private final String name;
    private double holidayDiscount;
    private double memberDiscount;
    public SaraCenter(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public double getHolidayDiscount() {
        return holidayDiscount;
    }
    public void setHolidayDiscount(double holidayDiscount) {
        this.holidayDiscount = holidayDiscount;
    }
    public double getMemberDiscount() {
        return memberDiscount;
    }
    public void setMemberDiscount(double memberDiscount) {
        this.memberDiscount = memberDiscount;
    }
    public DiscountCard buildHolidayCard(String id){
        return new HolidayCard(id,this);
    }
    public DiscountCard buildMemberCard(String id){
        return new MemberCard(id,this);
    }
}

