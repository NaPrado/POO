package Guias.TP6.Ej10;

import java.util.Objects;

public class Person implements Comparable<Person> {
    String name;
    int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public int compareTo(Person o) {
        return 0;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return name + " # " + age;
    }
}
