package block2.homework2_5;

import java.lang.reflect.*;
import java.math.BigDecimal;

public class BankAccountLauncher {

    public static void main(String[] args) throws NoSuchMethodException,
            InvocationTargetException, InstantiationException, IllegalAccessException {

        Class<IndividualsBankAccount> individualsBankAccountClass = IndividualsBankAccount.class;
        Constructor<?> individualsConstructor = individualsBankAccountClass.getConstructor
                (String.class, int.class, BigDecimal.class);

        IndividualsBankAccount individualsBankAccount1 = (IndividualsBankAccount) individualsConstructor.newInstance(
                "Individual Account_1", 1234, BigDecimal.valueOf(10_000));
        individualsBankAccount1.printBankAccount();
        System.out.println();

        Class<LegalsBankAccount> legalsBankAccountClass = LegalsBankAccount.class;
        Constructor<?> legalsConstructor = legalsBankAccountClass.getConstructor
                (String.class, int.class, BigDecimal.class);

        LegalsBankAccount legalsBankAccount1 = (LegalsBankAccount) legalsConstructor.newInstance
                ("Legal Account_1", 5678, BigDecimal.valueOf(20_000));
        legalsBankAccount1.printBankAccount();
        System.out.println();

        legalsBankAccount1.deposit(BigDecimal.valueOf(100));
        legalsBankAccount1.printBankAccount();
        System.out.println();

        try {
            individualsBankAccount1.withdrawal(BigDecimal.valueOf(11_000));
            individualsBankAccount1.printBankAccount();

        } catch (NotEnoughMoneyException ex) {
            System.out.println(ex.getMessage());
        }

    }
}