package homework13;

import java.lang.reflect.Field;
import java.math.BigDecimal;

public class BankAccountLauncher {

    public static void main(String[] args) throws Exception {

//        try {
//            IndividualsBankAccount account = new IndividualsBankAccount("Client1", 1234,
//                    BigDecimal.valueOf(100));
//            account.deposit(BigDecimal.valueOf(10_000.00));
//            account.withdrawal(BigDecimal.valueOf(10_000.00));
//        } catch (NotEnoughMoneyException ex) {
//            System.out.println(ex.getMessage());
//        }
        Class<IndividualsBankAccount> individualsBankAccountClass = IndividualsBankAccount.class;
        Field[] individualsFields = individualsBankAccountClass.getDeclaredFields();
        for(Field field: individualsFields){
            System.out.println(field);
        }
        Class<LegalsBankAccount> legalsBankAccountClass = LegalsBankAccount.class;
        Field[] legalFields = legalsBankAccountClass.getDeclaredFields();
        for(Field field: legalFields){
            System.out.println(field);
        }
    }
}