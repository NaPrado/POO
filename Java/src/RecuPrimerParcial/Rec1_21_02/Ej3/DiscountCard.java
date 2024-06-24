package RecuPrimerParcial.Rec1_21_02.Ej3;

public abstract class DiscountCard {
    protected String id;
    protected SaraCenter sc;
    protected double gastos=0;
    DiscountCard(String id, SaraCenter sc ){
        this.id = id;
        this.sc = sc;
    }
    public abstract double checkPrice(Product p);
    public void buyProduct(Product p){
        gastos+=checkPrice(p);
    }
    public String toString() {
        return " card %s of %s spent %.2f".formatted(id,sc.getName(),gastos);
    }
}
