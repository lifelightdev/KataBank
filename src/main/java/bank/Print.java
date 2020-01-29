package bank;

import java.util.List;

public class Print {

    private final static String LINE_SEPARATOR = System.getProperty("line.separator");
    private final static String COLUMN_SEPARATOR = " | ";

    public static String historyOperations(List<Transaction> transactions) {
        StringBuilder history = new StringBuilder();
        int balance = 0;
        for (Transaction transaction: transactions){
            history.append(transaction.getType().toString()).append(COLUMN_SEPARATOR)
                    .append(transaction.getDate()).append(COLUMN_SEPARATOR)
                    .append(transaction.getAmount()).append(COLUMN_SEPARATOR)
                    .append(transaction.calculateBalance(balance)).append(LINE_SEPARATOR);
            balance = transaction.calculateBalance(balance);
        }
        return history.toString();
    }
}
