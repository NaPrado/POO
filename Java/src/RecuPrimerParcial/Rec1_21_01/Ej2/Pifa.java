package RecuPrimerParcial.Rec1_21_01.Ej2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class Pifa {
    private static final int INIT_ID=1000;
    private static final int INIT_SIZE=10;
    private Bill[] bills = new Bill[INIT_SIZE];
    private int size=0;
    private void resize(){
        bills= Arrays.copyOf(bills, bills.length+INIT_SIZE);
    }
    public void generateBill(String cuit, LocalDate fecha, double monto){
        if (size==bills.length){
            resize();
        }
        int id=INIT_ID+size+1;
        bills[size++]= new Bill(id,cuit,fecha,monto);
        System.out.println("Generating bill with id "+ id);
    }
    public Bill[] getBills(){
        return getBills(Comparator.naturalOrder());
    }
    public Bill[] getBills(Comparator<Bill> cmp){
        if (size==0){
            throw new NoBillsException();
        }
        Bill[] copy=Arrays.copyOf(bills, size);
        Arrays.sort(copy,cmp);
        return copy;
    }
}
