package homework14;

import java.lang.reflect.*;
import java.math.BigDecimal;

public class BankAccountRunner {
    public static void main(String[] args) throws NoSuchMethodException,
            InvocationTargetException, InstantiationException, IllegalAccessException {

        Class<IndividualsBankAccount> individualsBankAccountClass = IndividualsBankAccount.class;
        Constructor<?> individualsConstructor = individualsBankAccountClass.getConstructor
                (String.class, int.class, BigDecimal.class);

        IndividualsBankAccount individualsBankAccount1 = (IndividualsBankAccount) individualsConstructor.newInstance(
                "Individual Account_1", 1234, BigDecimal.valueOf(10_000));

        ClassLoader individualClassLoader = individualsBankAccount1.getClass().getClassLoader();
        Class[] interfaces = individualsBankAccount1.getClass().getInterfaces();
        BankAccount proxyIndividual = (BankAccount) Proxy.newProxyInstance(individualClassLoader,
                interfaces, new ProxyBankAccount(individualsBankAccount1));

    }
}