package RecuPrimerParcial.Rec1_21_02.Ej2;

public enum Type {
    PT(100,0),
    FT(200,10),
    D(300,20);
    private final int pph;
    private final int ppaa;
    Type(int pph, int ppaa) {
        this.pph=pph;
        this.ppaa=ppaa;
    }
    public int gSalary(int hs, int ant){
        return hs * pph + ppaa * ant;
    }
}
