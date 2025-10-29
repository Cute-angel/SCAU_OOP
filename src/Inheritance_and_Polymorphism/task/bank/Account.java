package Inheritance_and_Polymorphism.task.bank;

public class Account {
    private String id;
    public  String name;
    private double balance;

    public Account(String id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return  String.format("[%s,%s,%.2f]",id,name,balance);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) return false;
        if (other == this) return true;
        if (other.getClass() != this.getClass()) return false;
        Account a = (Account) other;
        return this.id.equals(a.id);
    }

    public String getId(){
        return id;
    }
}
