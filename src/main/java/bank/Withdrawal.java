package bank;

import java.time.LocalDate;

public class Withdrawal extends Transaction {

    public Withdrawal(LocalDate date, int amount) {
        super(date, amount);
    }

    @Override
    public TypeTransaction getType() {
        return TypeTransaction.Withdrawal;
    }

    @Override
    public int calculateBalance(int balance) {
        return balance - amount;
    }

}