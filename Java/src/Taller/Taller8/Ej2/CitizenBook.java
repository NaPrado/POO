package Taller.Taller8.Ej2;

import java.util.*;

public class CitizenBook {
    Map<String, Set<Citizen>> mapaOrdenadoPorApellido=new TreeMap<>();
    void add(Citizen citizen){
        mapaOrdenadoPorApellido
                .putIfAbsent(citizen.getApellido(),
                        new TreeSet<>(
                                (citizen1,citizen2)-> citizen1.getNombre().compareTo(citizen2.getNombre())
                        )
                )
        ;

        mapaOrdenadoPorApellido
                .get(citizen.getApellido())
                .add(citizen)
        ;
    }
    public Set<Citizen> getByLastName(String lastName){
        return mapaOrdenadoPorApellido
                .getOrDefault(lastName,new TreeSet<>(
                        (citizen1,citizen2)->citizen1.getNombre()
                                .compareTo(citizen2.getNombre())
                        )
                );
    }
}
