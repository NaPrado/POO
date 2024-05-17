package Guias.TP6.Ej2;

import java.util.ArrayList;
import java.util.List;

public class Ej2 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(6);
        list.add(8);
        list.add(10);
        /*for (Integer i : list) {
            if (i % 2 == 0) {
                list.remove(i);
            }
        }*/
        list.removeIf(integer -> integer % 2 == 0);
    }

}

