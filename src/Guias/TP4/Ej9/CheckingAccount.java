package Guias.TP4.Ej9;

public class CheckingAccount extends Accounts {
    private final double overDraft;
    CheckingAccount(int id, double overDraft){
        super(id);
        this.overDraft=overDraft;
    }

    @Override
    protected boolean canExtract(double amount) {
        return getBalance()+this.overDraft-amount>=0;
    }

    public double getOverDraft() {
        return overDraft;
    }
}
