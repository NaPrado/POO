package Taller.Taller7.Ej1;

public class Tester {
    public static void main(String[] args) {
        SimpleList<Integer> l1 = new SimpleArrayList<>();

        l1.add(1); l1.add(3);
        l1.add(5); l1.add(7);

        System.out.println(l1.size());
        System.out.println(l1.contains(0));

        SimpleList<Integer> l2 = l1.map(e -> e * 2);

        for(Integer e : l2) {
            System.out.println(e);
        }

    }
}
