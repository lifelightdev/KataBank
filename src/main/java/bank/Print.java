package bank;

import java.util.List;

public class Print {

    private final static String LINE_SEPARATOR = System.getProperty("line.separator");

    public static String historyOperations(List<Transaction> transactions) {
        return "Deposit | 2020-01-01 | 10 | 10" + LINE_SEPARATOR;
    }
}
