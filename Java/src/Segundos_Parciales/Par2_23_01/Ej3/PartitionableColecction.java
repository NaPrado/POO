package Segundos_Parciales.Par2_23_01.Ej3;


import java.util.ArrayList;
import java.util.function.Predicate;

public class PartitionableColecction<S> extends ArrayList<S> {
    public PartitionableColecction<S> getSelected(Predicate<S> fun){
        PartitionableColecction<S>pepe= new PartitionableColecction<S>();
        for (S elem: this){
            if(fun.test(elem)){
                pepe.add(elem);
            }
        }
        return pepe;
    }
    public PartitionableColecction<S>getRejected(Predicate<S> fun){
        return getSelected(fun.negate());
    }
}
