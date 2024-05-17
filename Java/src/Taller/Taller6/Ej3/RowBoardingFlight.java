package Taller.Taller6.Ej3;

import java.util.HashSet;
import java.util.Set;

public class RowBoardingFlight extends BoardingFlight{
    public RowBoardingFlight(){
        super((o1,o2)->{
            int ret=Integer.compare(o1.getSeat(), o2.getSeat());
            if (ret==0){
                ret=o1.getNombre().compareTo(o2.getNombre());
            }
            if(ret==0){
                ret= o1.getCat().compareTo(o2.getCat());
            }
            return ret;
        });
    }

}
