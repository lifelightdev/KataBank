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

}
