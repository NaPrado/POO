package TP2.Ej7;

public class test {
    public static void main(String[] args) {
        int[] a=new int[args.length];
        for (int i = 0; i < args.length; i++) {
            a[i]=Integer.parseInt(args[i]);
        }
        Histograma h = new Histograma(a);
        System.out.println(h.getHistogramaString());
    }
}
