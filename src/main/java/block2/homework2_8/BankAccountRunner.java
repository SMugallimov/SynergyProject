package block2.homework2_8;

import java.lang.reflect.*;
import java.math.BigDecimal;

public class BankAccountRunner {
    public static void main(String[] args) throws NoSuchMethodException,
            InvocationTargetException, InstantiationException, IllegalAccessException {

        Class<IndividualsBankAccount> individualsBankAccountClass = IndividualsBankAccount.class;
        Constructor<?> individualsConstructor = individualsBankAccountClass.getConstructor
                (String.class, int.class, BigDecimal.class);

        Class<LegalsBankAccount> legalsBankAccountClass = LegalsBankAccount.class;
        Constructor<?> legalsBankConstructor = legalsBankAccountClass.getConstructor
                (String.class, int.class, BigDecimal.class);

        IndividualsBankAccount individualsBankAccount1 = (IndividualsBankAccount) individualsConstructor.newInstance
                ("Individual Account_1", 1234, BigDecimal.valueOf(10_000));

        LegalsBankAccount legalsBankAccount1 = (LegalsBankAccount) legalsBankConstructor.newInstance
                ("Legal Account_1", 5678, BigDecimal.valueOf(20_000));


        Account individualsBlocked = (Account) Proxy.newProxyInstance(individualsBankAccount1.getClass().getClassLoader(),
                individualsBankAccount1.getClass().getSuperclass().getInterfaces(), new ProxyBankAccount(individualsBankAccount1));

        individualsBlocked.deposit(BigDecimal.valueOf(100));

        Account legalsBlocked = (Account) Proxy.newProxyInstance(legalsBankAccount1.getClass().getClassLoader(),
                legalsBankAccount1.getClass().getSuperclass().getInterfaces(), new ProxyBankAccount(legalsBankAccount1));

        legalsBlocked.withdrawal(BigDecimal.valueOf(200));

    }
}