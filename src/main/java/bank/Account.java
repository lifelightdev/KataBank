package bank;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Account {

    private int balance = 0;
    private List<Transaction> transactions = new ArrayList<>();

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdrawal(int amount) {
        balance -= amount;
    }

    public void deposit(LocalDate date, int amount) {
        transactions.add(new Deposit(date,amount));
        balance += amount;
    }

    public void withdrawal(LocalDate date, int amount) {
        transactions.add(new Withdrawal(date,amount));
    }

    public String printHistoryOperations() {
        return Print.historyOperations(transactions);
    }
}
