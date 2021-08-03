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

        Class[]cs = {Blocked.class};
        ClassLoader classLoader = Blocked.class.getClassLoader();
        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("The transaction is blocked.");
                return null;
            }
        };

        Blocked blocked = (Blocked) Proxy.newProxyInstance(classLoader, cs, invocationHandler);
        blocked.value();
    }
}