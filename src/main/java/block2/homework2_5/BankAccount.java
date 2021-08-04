package block2.homework2_5;

import java.math.BigDecimal;

public class BankAccount {
    private BigDecimal balance;
    private int iban;
    private String name;

    public BankAccount (String name, int iban, BigDecimal balance){
        this.name = name;
        this.iban = iban;
        this.balance = balance;
    }
    public void printBankAccount() {
        System.out.println("Name: " + this.name + "\nIBAN ID " + this.iban + "\nBalance " + this.balance);
    }

    @Blocked
    public BigDecimal deposit(BigDecimal value){
        BigDecimal newBalance = balance.add(value);
        return balance = newBalance;
    }

    @Blocked
    public BigDecimal withdrawal(BigDecimal value){
        BigDecimal newBalance = balance.subtract(value);
        if (newBalance.compareTo(BigDecimal.ZERO) < 0) {
            throw new NotEnoughMoneyException("Withdrawal is declined. Not enough money on your account!");
        }
        return balance = newBalance;
    }
}