package homework13;

import java.math.BigDecimal;

public class IndividualsBankAccount {
    private BigDecimal balance;
    private int iban;
    private String name;

    private IndividualsBankAccount (String name, int iban, BigDecimal balance){
        this.name = name;
        this.iban = iban;
        this.balance = balance;
    }
    private void printBankAccount(BigDecimal value)
    {
        System.out.println("Name: " + name + " IBAN ID " + iban + " Adding " + value + ". Balance " + value);
    }

    private BigDecimal deposit(BigDecimal value){
        BigDecimal newBalance = balance.add(value);
        return balance = newBalance;
    }

    private BigDecimal withdrawal(BigDecimal value) throws NotEnoughMoneyException{
        BigDecimal newBalance = balance.subtract(value);
        if (newBalance.compareTo(BigDecimal.ZERO) < 0) throw new NotEnoughMoneyException("Withdrawal is delained. " + "Not enough money on your account!");
        return balance = newBalance;
    }
}