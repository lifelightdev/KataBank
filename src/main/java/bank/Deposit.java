package bank;

import java.time.LocalDate;

public class Deposit extends Transaction {

    public Deposit(LocalDate date, int amount) {
        super(date, amount);
    }

    @Override
    public TypeTransaction getType() {
        return TypeTransaction.Deposit;
    }

    @Override
    public int calculateBalance(int balance) {
        return balance + getAmount();
    }

}
