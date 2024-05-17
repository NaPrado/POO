package Taller.Taller6.Ej3;

import java.util.Comparator;

public class CategoryBoardingFlight extends BoardingFlight{
    public CategoryBoardingFlight() {
        super((o1,o2)->{
            int ret=o1.getCat().compareTo(o2.getCat());
            if (ret==0){
                ret=o1.getNombre().compareTo(o2.getNombre());
            }
            if(ret==0) {
                ret = Integer.compare(o1.getSeat(), o2.getSeat());
            }
            return ret;
        });
    }
}
