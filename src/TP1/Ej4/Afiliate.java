package TP1.Ej4;

import java.util.Date;

public class Afiliate {
    private final String name;
    private final String surname;
    private final Date bornDate;
    private final int id;
    private static final int initialId = 1000;
    private static int amountId = 0;
    public Afiliate(String name,String surname, Date bornDate){
        this.name=name;
        this.surname=surname;
        this.bornDate=bornDate;
        this.id=getAndIncrement();
    }
    private int getAndIncrement(){
        int actualId=initialId + amountId;
        amountId++;
        return actualId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getBornDate() {
        return bornDate;
    }

    public int getId() {
        return id;
    }
}
