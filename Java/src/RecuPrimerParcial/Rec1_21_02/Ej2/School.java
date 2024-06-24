package RecuPrimerParcial.Rec1_21_02.Ej2;

import java.util.Arrays;
import java.util.Comparator;

public class School {
    private static final int INIT_SIZE=10;
    private Employee[] v = new Employee [INIT_SIZE];
    private int sp=0;
    private void resize(){
        v= Arrays.copyOf(v,v.length+INIT_SIZE);
    }
    public void hireEmployee(String name,int ant, Type cargo){
        if(sp>v.length){
            resize();
        }
        v[sp++]=new Employee(name,ant,cargo);
    }
    public int getSalary(String name,int hs){
        for(int i=0;i<sp;i++){
            if(v[i].gName().equals(name)){
                return v[i].gCargo().gSalary(hs,v[i].gAnt());
            }
        }
        throw new RuntimeException("Employee Not Found");
    }
    public Employee [] employees(){
        Employee [] toRet= Arrays.copyOf(v,sp);
        Arrays.sort(toRet);
        return toRet;
    }
}
