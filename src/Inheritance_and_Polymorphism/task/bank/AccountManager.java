package Inheritance_and_Polymorphism.task.bank;

import java.util.ArrayList;

public class AccountManager {
    private ArrayList<Account> accountList = new ArrayList<>(10);
    private int size = 0;

    public boolean addAccount(Account account){
        if (accountList.contains(account)){
            return false;
        }
        accountList.add(account);
        size++;
        return true;
    }

    public boolean removeAccount(String id){
        var _tmp = new Account(id, "",0);
        for (var i : accountList){
            if (i.equals(_tmp) && i.getBalance() == 0){
                accountList.remove(i);
                size--;
                return true;
            }
        }
        return false;
    }

    public Account getAccount(String id){
        for (var i : accountList){
            if (i.getId().equals(id)){
                return i;
            }
        }
        return null;
    }

    public double getTotalBalance(){
        double total = 0.0;
        for (var i : accountList){
            total += i.getBalance();
        }
        return total;
    }

    public int getNumberOfCreditAccount(){
        int count = 0;
        for (var i : accountList){
            if (i instanceof CreditAccount){
                count++;
            }
        }
        return count;
    }

    public int getSize() {
        return size;
    }

    public Account[] getAllAccounts() {
        return accountList.toArray(new Account[0]);
    }
}
