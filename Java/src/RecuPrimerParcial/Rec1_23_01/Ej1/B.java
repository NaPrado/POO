package RecuPrimerParcial.Rec1_23_01.Ej1;

public class B extends A {
    int m1() {
        return m2();
    }
    int m2() {
        return 22;
    }
    int m3() {
        return super.m2();
    }
}
