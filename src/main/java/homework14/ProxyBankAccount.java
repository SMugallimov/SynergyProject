package homework14;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyBankAccount implements InvocationHandler {
    private BankAccount bankAccount;

    public ProxyBankAccount(BankAccount bankAccount){
        this.bankAccount = bankAccount;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            return null;
    }
}