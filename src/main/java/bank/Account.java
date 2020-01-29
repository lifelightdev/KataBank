package bank;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Account {

    private final List<Transaction> transactions = new ArrayList<>();

    public int getBalance() {
        return transactions.stream().mapToInt(x -> x.calculateBalance(0)).sum();
    }

    public void deposit(LocalDate date, int amount) {
        transactions.add(Transaction.createDeposit(date, amount));
    }

    public void withdrawal(LocalDate date, int amount) {
        transactions.add(Transaction.createWithdrawal(date, amount));
    }

    public String printHistoryOperations() {
        return Print.historyOperations(transactions);
    }

}
