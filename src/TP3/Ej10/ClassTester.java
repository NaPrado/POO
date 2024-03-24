package TP3.Ej10;

public class ClassTester {
    public static void main(String args[]) {
        A instance;
        instance = new A();
        System.out.println(instance.m1());
        System.out.println(instance.m2());
        System.out.println(instance.m3());
        System.out.println(instance.m4());
        System.out.println(((B)instance).m5());
        System.out.println(((C)instance).m6());
        System.out.println(((B)instance).m7());
        instance = new B();
        System.out.println(instance.m1());
        System.out.println(instance.m2());
        System.out.println(instance.m3());
        System.out.println(instance.m4());
        System.out.println(((B)instance).m5());
        System.out.println(((C)instance).m6());
        System.out.println(((B)instance).m7());
        instance = new C();
        System.out.println(instance.m1());
        System.out.println(instance.m2());
        System.out.println(instance.m3());
        System.out.println(instance.m4());
        System.out.println(((B)instance).m5());
        System.out.println(((C)instance).m6());
        System.out.println(((B)instance).m7());
        instance = new D();
        System.out.println(instance.m1());
        System.out.println(instance.m2());
        System.out.println(instance.m3());
        System.out.println(instance.m4());
        System.out.println(((B)instance).m5());
        System.out.println(((C)instance).m6());
        System.out.println(((B)instance).m7());
    }
}


