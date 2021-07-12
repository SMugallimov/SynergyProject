package homework13;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;

public class BankAccountLauncher {

    public static void main(String[] args) throws Exception{
        Class<IndividualsBankAccount> individualsClass = IndividualsBankAccount.class;

        try{
            IndividualsBankAccount individualsBankAccount = individualsClass.newInstance();
            System.out.println(individualsBankAccount);

            Constructor<IndividualsBankAccount> individualsConstructor = individualsClass.getConstructor();
            IndividualsBankAccount individualsBankAccount1 = individualsConstructor.newInstance("CLIENT1", 1234,
                    BigDecimal.valueOf(10000));
            System.out.println(individualsBankAccount1);

            Field nameField = individualsClass.getDeclaredField("name");
            nameField.setAccessible(true);
            System.out.println(nameField);

            Field ibanField = individualsClass.getDeclaredField("iban");
            ibanField.setAccessible(true);
            System.out.println(ibanField);

            Field balanceField = individualsClass.getDeclaredField("balance");
            balanceField.setAccessible(true);
            System.out.println(balanceField);

            Method depositMethod = individualsClass.getDeclaredMethod("deposit", BigDecimal.class);
            depositMethod.invoke(individualsClass, 100);
            System.out.println(depositMethod.getReturnType());

            Method withdrawalMethod = individualsClass.getDeclaredMethod("withdrawal", BigDecimal.class);
            withdrawalMethod.invoke(individualsClass, 200);
            System.out.println(withdrawalMethod.getReturnType());

            Method printBankAccountMethod = individualsClass.getDeclaredMethod("printBankAccount", BigDecimal.class);
            System.out.println(printBankAccountMethod);
        }
        catch(NoSuchFieldException |InstantiationException | NoSuchMethodException ex){
            ex.printStackTrace();
        }
    }
}