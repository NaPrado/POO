package Guias.TP6.Ej6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonCollectionImpl implements PersonCollection {
    Map<String, Map<String,Person>> persons=new HashMap<>();
    @Override
    public void addPerson(Person aPerson) {
        persons.putIfAbsent(aPerson.getLastName(), new HashMap<>());
        persons.get(aPerson.getLastName()).put(aPerson.getFirstName(), aPerson);
    }

    @Override
    public List<Person> findByLastName(String lastName) {
        return new ArrayList<>(persons.getOrDefault(lastName,new HashMap<>()).values());
    }

    @Override
    public Person findByName(String firstName, String lastName) {
        return persons.getOrDefault(lastName,new HashMap<>()).get(firstName);
    }
}
