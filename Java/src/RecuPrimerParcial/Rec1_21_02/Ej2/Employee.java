package RecuPrimerParcial.Rec1_21_02.Ej2;

public class Employee implements Comparable<Employee> {
    private String name;
    private int ant;
    private Type cargo;
    Employee(String name,int ant, Type cargo){
        this.name=name;
        this.ant=ant;
        this.cargo=cargo;
    }
    public String gName(){
        return name;
    }
    public int gAnt(){
        return ant;
    }
    public Type gCargo(){
        return cargo;
    }
    @Override
    public String toString(){
        return "<%s # %d años>".formatted(name,ant);
    }
    @Override
    public int compareTo(Employee o) {
        int cmp = Integer.compare(ant, o.ant);
        if(cmp == 0) {
            cmp = o.name.compareTo(name);
        }
        return cmp;
    }
}
