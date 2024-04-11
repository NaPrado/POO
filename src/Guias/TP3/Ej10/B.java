package Guias.TP3.Ej10;

class B extends A {

    int m1() {
        return 8;
    }

    int m2() {
        return super.m1();
    }

    int m4() {
        return 20;
    }

    int m5() {
        return m3();
    }

    int m7() {
        return m4();
    }

}

