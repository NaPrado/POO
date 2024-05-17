package Taller.Taller8.Ej1;



import java.util.*;

public class Ej1Tester {
    public static void main(String[] args) {
        Citizen c1 = new Citizen(123,"Juan","Perez");
        Citizen c2 = new Citizen(234,"Lucia","Garcia");
        Citizen c3 = new Citizen(312,"Mario","Suarez");
        Citizen c4 = new Citizen(299,"Laura","Luna");

        Map<Integer,Citizen> mapaPorDni = new HashMap<>();

        mapaPorDni.put(c1.getDni(), c1);
        mapaPorDni.put(c2.getDni(), c2);
        mapaPorDni.put(c3.getDni(), c3);

        System.out.println(mapaPorDni.get(234));

        Map<String, List<Citizen>> mapaPorNombre = new HashMap<>();

        mapaPorNombre.put(c1.getName(), new ArrayList<Citizen>());
        mapaPorNombre.get(c1.getName()).add(c1);

        System.out.println(mapaPorNombre.get("Juan"));

        Map<String, Map<String, List<Citizen>>> mapaPorNombreApellido = new HashMap<>();

        mapaPorNombreApellido
                .put(c1.getName(),new HashMap<>());

        mapaPorNombreApellido
                .get(c1.getName())
                .put(c1.getSurname(), new ArrayList<>());

        mapaPorNombreApellido
                .get(c1.getName())
                .get(c1.getSurname())
                .add(c1);

        System.out.println(mapaPorNombreApellido.get("Juan"));

        Map<Integer,Citizen> mapaOredenadoDni=new TreeMap<>();
        mapaOredenadoDni.put(c1.getDni(), c1);
        mapaOredenadoDni.put(c2.getDni(), c2);
        mapaOredenadoDni.put(c3.getDni(), c3);
        mapaOredenadoDni.put(c4.getDni(), c4);

        System.out.println(mapaOredenadoDni);

    }
}
