package block2.homework2_8;

import java.math.BigDecimal;

public interface Account {

    void printBankAccount();

    default BigDecimal deposit(BigDecimal value){

        return value;
    }

    default BigDecimal withdrawal(BigDecimal value){

        return value;
    }
}