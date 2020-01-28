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

    public void deposit(LocalDate date, int amount) {
        Deposit deposit = new Deposit(date,amount);
        transactions.add(deposit);
        balance = deposit.calculateBalance(balance);
    }

    public void withdrawal(LocalDate date, int amount) {
        Withdrawal withdrawal = new Withdrawal(date,amount);
        transactions.add(withdrawal);
        balance = withdrawal.calculateBalance(balance);
    }

    public String printHistoryOperations() {
        return Print.historyOperations(transactions);
    }
}
