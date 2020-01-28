package bank;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Account {
    private List<Transaction> transactions = new ArrayList<>();

    public int getBalance() {
        int balance = 0;
        for (Transaction transaction: transactions){
            balance = transaction.calculateBalance(balance);
        }
        return balance;
    }

    public void deposit(LocalDate date, int amount) {
        Deposit deposit = new Deposit(date,amount);
        transactions.add(deposit);
    }

    public void withdrawal(LocalDate date, int amount) {
        Withdrawal withdrawal = new Withdrawal(date,amount);
        transactions.add(withdrawal);
    }

    public String printHistoryOperations() {
        return Print.historyOperations(transactions);
    }
}
