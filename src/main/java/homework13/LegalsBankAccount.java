package homework13;

import java.math.BigDecimal;

public class LegalsBankAccount {

    private BigDecimal balance;
    private int iban;
    private String name;

    public LegalsBankAccount (String name, int iban, BigDecimal balance){
        this.name = name;
        this.iban = iban;
        this.balance = balance;
    }
    public void deposit(BigDecimal value){
        BigDecimal newBalance = balance.add(value);
        System.out.println("Name: " + name + " IBAN ID " + iban + " Adding " + value + ". New balance " + newBalance);
        balance = newBalance;
    }
    public void withdrawal(BigDecimal value) throws NotEnoughMoneyException{
        BigDecimal newBalance = balance.subtract(value);
        if (newBalance.compareTo(BigDecimal.ZERO) < 0) throw new NotEnoughMoneyException("Withdrawal is delained. " +
                "Not enough money on your account!");
        balance = newBalance;
        System.out.println("Name: " + name + " IBAN ID " + iban + " Withdrawal " + value + ". New balance " + balance);
    }
}