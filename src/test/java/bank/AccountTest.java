package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    private Account account;

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
        account.deposit(1);

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

}
