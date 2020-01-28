package bank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    void Shouls_balanceReturn0_When_noTransaction() {

        // Give
        Account account = new Account();

        // When

        //Then
        assertThat(account.getBalance()).isEqualTo(0);

    }

    @Test
    void Should_balanceReturn1_When_firstDeposit1() {

        // Give
        Account account = new Account();

        // When
        account.deposit(1);

        //Then
        assertThat(account.getBalance()).isEqualTo(1);

    }

}
