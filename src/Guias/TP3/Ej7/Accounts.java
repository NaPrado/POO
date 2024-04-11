package Guias.TP3.Ej7;

public abstract class Accounts {
    private final int id;
    private double balance;
    Accounts(int id){
        this.id=id;
        this.balance=balance;
    }
    public void deposit(double amount){
        this.balance=+amount;
    }
    public void extract (double amount){
        if (canExtract(amount)){
            this.balance -= amount;
        }
        else{
            System.out.println("Extract cannot be done, no enough founds");
        }
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
}
