package Guias.TP1.Ej1;

public class RatioScript {

    public static void main(String[] args) {
//        int chainring = 52;
//        double cog = 11;
//        double ratio = chainring / cog;
//        System.out.println(ratio); // 4.7272727272727275
//
//        chainring = 30;
//        cog = 27;
//        ratio = chainring / cog;
//        System.out.println(ratio); // 1.1111111111111112
        Gear g1 = new Gear(52,11);
        System.out.println(g1.getRatio());
        Gear g2 = new Gear(30,27);
        System.out.println(g2.getRatio());
    }

}
