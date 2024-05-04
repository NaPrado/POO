package Guias.TP4.Ej9;

public class SavingsAccount extends Accounts {
    SavingsAccount(int id){
        super(id);
    }

    @Override
    protected boolean canExtract(double amount) {
        return getBalance()-amount>=0;
    }
}
