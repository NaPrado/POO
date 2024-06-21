package RecuPrimerParcial.Rec1_23_01.Ej1;

public class A {
    int m1() {
        return 11;
    }
    int m2() {
        return m1();
    }
    int m3() {
        return this.m1();
    }
}
