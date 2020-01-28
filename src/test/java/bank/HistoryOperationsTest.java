package bank;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class HistoryOperationsTest {

    private final static String LINE_SEPARATOR = System.getProperty("line.separator");

    private final static LocalDate THE_2020_01_01 = LocalDate.of(2020,1,1);
    private final static int AMOUNT_10 = 10;

    @Test
    void Should_returnHistoryOfOneOperation_When_deposit(){
        // Give
        List<Transaction> transactions = new ArrayList<>();
        // When
        transactions.add(new Deposit(THE_2020_01_01, AMOUNT_10));
        // Then
        assertThat(Print.historyOperations(transactions)).isEqualTo("Deposit | 2020-01-01 | 10 | 10" + LINE_SEPARATOR);
    }
}
