package Guias.TP6.Ej4;

public class SavingsAccount extends BankAccount{
    SavingsAccount(int id){
        super(id);
    }

    @Override
    protected boolean canExtract(double amount) {
        return getBalance()-amount>=0;
    }
}
