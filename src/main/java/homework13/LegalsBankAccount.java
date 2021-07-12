package homework13;

import java.math.BigDecimal;

public class LegalsBankAccount extends BankAccount{
    public LegalsBankAccount(String name, int iban, BigDecimal balance){
        super(name, iban, balance);
    }
}