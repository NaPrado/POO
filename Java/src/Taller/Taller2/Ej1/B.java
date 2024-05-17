package Taller.Taller2.Ej1;

class B extends A {
    int m1() {
        return m2();
    }
    int m2() {
        return 2;
    }
    int m3() {
        return super.m2();
    }
}

