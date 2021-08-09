package block2.homework2_8;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyBankAccount implements InvocationHandler {
    public BankAccount bankAccount;

    public ProxyBankAccount(BankAccount bankAccount){
        this.bankAccount = bankAccount;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{

        Class clazz = BankAccount.class;
        Method[] methods = clazz.getMethods();

        for(Method m : methods){
            if (m.isAnnotationPresent(Blocked.class)) {
                throw new BlockedTransactions("Transaction is blocked");
            }
        }
        return  method.invoke(bankAccount, args);
    }
}