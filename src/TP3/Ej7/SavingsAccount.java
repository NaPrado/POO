package TP3.Ej7;

public class SavingsAccount extends Accounts{
    SavingsAccount(int id){
        super(id);
    }

    @Override
    protected boolean canExtract(double amount) {
        return getBalance()-amount>=0;
    }
}
