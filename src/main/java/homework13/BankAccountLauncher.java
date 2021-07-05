package homework13;

import java.lang.reflect.Field;
import java.math.BigDecimal;

public class BankAccountLauncher {

    public static void main(String[] args) throws Exception {

        IndividualsBankAccount individuals = new IndividualsBankAccount("Client1", 1234,
                BigDecimal.valueOf(10_000));

        Field nameIndividualField = IndividualsBankAccount.class.getDeclaredField("name");
        nameIndividualField.setAccessible(true);
        String name = (String) nameIndividualField.get(individuals);

        Field ibanIndividualField = IndividualsBankAccount.class.getDeclaredField("iban");
        ibanIndividualField.setAccessible(true);
        int iban = (int)ibanIndividualField.get(individuals);

        Field balanceIndividualField = IndividualsBankAccount.class.getDeclaredField("balance");
        balanceIndividualField.setAccessible(true);
        BigDecimal balance = (BigDecimal) balanceIndividualField.get(individuals);

        individuals.deposit(BigDecimal.valueOf(100));
    }
}