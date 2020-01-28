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

}
