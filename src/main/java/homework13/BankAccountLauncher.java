package homework13;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

public class BankAccountLauncher {

    public static void main(String[] args) throws NoSuchMethodException,
            SecurityException, InstantiationException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException {

        Class<IndividualsBankAccount> individualsBankAccountClass = IndividualsBankAccount.class;
        Constructor<?> individualsConstructor = individualsBankAccountClass.getConstructor
                (String.class,int.class,BigDecimal.class);

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

        legalsBankAccount1.deposit(BigDecimal.valueOf(100));
        legalsBankAccount1.printBankAccount();

    }
}