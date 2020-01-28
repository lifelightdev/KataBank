package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    private Account account;

    private final static String LINE_SEPARATOR = System.getProperty("line.separator");

    private final static LocalDate THE_2020_01_01 = LocalDate.of(2020,1,1);
    private final static LocalDate THE_2020_01_02 = LocalDate.of(2020,1,2);
    private final static LocalDate THE_2020_01_03 = LocalDate.of(2020,1,3);
    private final static LocalDate THE_2020_01_04 = LocalDate.of(2020,1,4);
    private final static int AMOUNT_5 = 5;
    private final static int AMOUNT_10 = 10;
    private final static int AMOUNT_50 = 50;

    @BeforeEach
    private void setup(){
         account = new Account();
    }

    @Test
    void Shouls_balanceReturn0_When_noTransaction() {
        assertThat(account.getBalance()).isEqualTo(0);
    }

    @Test
    void Should_balanceReturn1_When_firstDeposit1() {

        // When
        account.deposit( THE_2020_01_01,1);

        //Then
        assertThat(account.getBalance()).isEqualTo(1);

    }

    @Test
    void Should_returnBalance_When_someDeposit() {

        // When
        account.deposit(1);
        account.deposit(3);
        account.deposit(6);

        //Then
        assertThat(account.getBalance()).isEqualTo(10);

    }

    @Test
    void Should_balanceReturn10_When_deposit15AndWithdrawal5() {

        // When
        account.deposit(15);
        account.withdrawal(5);

        //Then
        assertThat(account.getBalance()).isEqualTo(10);

    }

    @Test
    void Should_balanceReturn_When_someWithdrawal() {

        // When
        account.deposit(15);
        account.withdrawal(5);
        account.withdrawal(2);

        //Then
        assertThat(account.getBalance()).isEqualTo(8);

    }

    @Test
    void Should_returnHistoryOfOperations_When_someDepositAndSomeWithdrawal(){

        // When
        account.deposit(THE_2020_01_01, AMOUNT_50);
        account.withdrawal(THE_2020_01_02, AMOUNT_10);
        account.deposit(THE_2020_01_03, AMOUNT_10);
        account.withdrawal(THE_2020_01_04, AMOUNT_5);
        // Then
        assertThat(account.printHistoryOperations()).isEqualTo(
                "Deposit | 2020-01-01 | 50 | 50" + LINE_SEPARATOR +
                "Withdrawal | 2020-01-02 | 10 | 40" + LINE_SEPARATOR +
                "Deposit | 2020-01-03 | 10 | 50" + LINE_SEPARATOR +
                "Withdrawal | 2020-01-04 | 5 | 45" + LINE_SEPARATOR);
    }

}
