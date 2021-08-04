package block2.homework2_8;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyBankAccount implements InvocationHandler {
    private final BankAccount bankAccount;

    public ProxyBankAccount(BankAccount bankAccount){
        this.bankAccount = bankAccount;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            return method.invoke(bankAccount, args);
    }
}