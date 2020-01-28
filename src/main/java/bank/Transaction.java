package bank;
import java.time.LocalDate;

abstract class Transaction {

    private LocalDate date;
    private int amount;

    static Deposit createDeposit(LocalDate date, int amount){
        return new Deposit(date, amount);
    }

    static Withdrawal createWithdrawal(LocalDate date, int amount){
        return new Withdrawal(date, amount);
    }

    protected Transaction(LocalDate date, int amount) {
        super();
        this.date = date;
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }
    public int getAmount() {
        return amount;
    }
    abstract TypeTransaction getType();
    abstract int calculateBalance(int balance);
}