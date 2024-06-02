/*
package Guias.TP7.Ej8;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class BankAccount {
    private final int id;
    private double balance;
    private final List<BankAccountMovement> movements;
    BankAccount(int id){
        this.id=id;
        movements=new ArrayList<>();
        this.balance=balance;
    }
    public double deposit(double amount){
        this.balance=+amount;
        this.movements.add(new BankAccountMovement(BankAccountMovementType.DEPOSIT,amount));
        return balance;
    }
    public double extract (double amount){
        if (canExtract(amount)){
            this.balance -= amount;
        }
        else{
            System.out.println("Extract cannot be done, no enough founds");
        }
        return balance;
    }
    public double getBalance() {
        return balance;
    }
    public int getId() {
        return id;
    }
    protected abstract boolean canExtract(double amount);

    @Override
    public String toString() {
        return "Id:%d Balance:%.2f".formatted(id,balance);
    }
    @Override
    public boolean equals(Object o) {
        return o instanceof BankAccount that &&
                id == that.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public void showMovements() {

    }
}
*/
