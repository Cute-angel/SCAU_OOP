package Inheritance_and_Polymorphism.task.bank;

public class CreditAccount  extends  Account{

    private double limit;

    public CreditAccount(String id, String name, double balance) {
        super(id, name, balance);
        this.limit = 0.0;
    }

    public CreditAccount(String id, String name, double balance, double limit) {
        super(id, name, balance);
        this.limit = limit;
    }

    @Override
    public String toString() {
        return String.format("%s,%.2f]", super.toString().substring(0, super.toString().length() - 1), limit);
    }

    public boolean withdraw(double amount){
        if (this.getBalance() + limit >= amount){
            this.setBalance(this.getBalance() - amount);
            return true;
        }
        return false;
    }
}
