package Segundos_Parciales.Par2_23_01.Ej2;

import java.util.*;



public class AddressBook {
    SortedMap<AddressBookGroup, SortedSet<Contact>> aB=new TreeMap<>();
    public void addContact(AddressBookGroup group, String name, String num){
        aB.putIfAbsent(group, new TreeSet<>());
        aB.get(group).add(new Contact(name, num));
    }
    public SortedSet<Contact> getAllContacts(AddressBookGroup group){
        return aB.getOrDefault(group, new TreeSet<>());
    }

    public Set<Contact> getAllContacts(){
        Set<Contact> ret=new HashSet<Contact>();
        for (AddressBookGroup e:aB.keySet()){
            ret.addAll(getAllContacts(e));
        }
        return ret;
    }

    public Contact getContact(AddressBookGroup group, String name){
        SortedSet<Contact> contacts=getAllContacts(group);
        for (Contact e : contacts){
            if (e.getName().equals(name)){
                return e;
            }
        }
        throw new IllegalArgumentException();
    }
    public void renameContact(AddressBookGroup group, String oldName, String newName){
        getContact(group, oldName).setName(newName);
    }

}
