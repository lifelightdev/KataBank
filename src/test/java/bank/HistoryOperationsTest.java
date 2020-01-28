package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class HistoryOperationsTest {

    private List<Transaction> transactions;

    private final static String LINE_SEPARATOR = System.getProperty("line.separator");

    private final static LocalDate THE_2020_01_01 = LocalDate.of(2020,1,1);
    private final static LocalDate THE_2020_01_02 = LocalDate.of(2020,1,2);
    private final static int AMOUNT_10 = 10;
    private final static int AMOUNT_20 = 20;

    @BeforeEach
    private void setup(){
        transactions = new ArrayList<>();
    }

    @Test
    void Should_returnHistoryOfOneOperation_When_deposit(){
        // When
        transactions.add(new Deposit(THE_2020_01_01, AMOUNT_10));
        // Then
        assertThat(Print.historyOperations(transactions)).isEqualTo("Deposit | 2020-01-01 | 10 | 10" + LINE_SEPARATOR);
    }

    @Test
    void Should_returnHistoryOfSomeOperationDeposit_When_someDeposit(){
        // When
        transactions.add(new Deposit(THE_2020_01_01, AMOUNT_10));
        transactions.add(new Deposit(THE_2020_01_02, AMOUNT_20));
        // Then
        assertThat(Print.historyOperations(transactions)).isEqualTo("Deposit | 2020-01-01 | 10 | 10" + LINE_SEPARATOR +
                "Deposit | 2020-01-02 | 20 | 30" + LINE_SEPARATOR);
    }

}
