package block2.homework2_8;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.stream.Stream;

public class ProxyBankAccount implements InvocationHandler {
    public BankAccount bankAccount;

    public ProxyBankAccount(BankAccount bankAccount){
        this.bankAccount = bankAccount;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

//        Method originMethod = bankAccount.getClass().getMethod(method.getName(),
//                Stream.of(args).map(Object::getClass).toArray(Class<?>[]::new));
//            if (originMethod.isAnnotationPresent(Blocked.class)) {
//                throw new BlockedTransactions("Transaction is blocked");
//            }

        Class clazz = BankAccount.class;
        Method[] originMethods = clazz.getMethods();
        for(Method m: originMethods){
            if(m.getName().equals("deposit") && m.isAnnotationPresent(Blocked.class) || m.getName().equals("withdrawal")
                    && m.isAnnotationPresent(Blocked.class)) {
                throw new BlockedTransactions("Transaction is blocked");
            }
        }

        return  method.invoke(bankAccount, args);
    }
}