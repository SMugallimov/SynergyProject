package homework13;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Collection;

public class BankAccountLauncher {

    public static void main(String[] args) throws Exception{
        Class<IndividualsBankAccount> individualsClass = IndividualsBankAccount.class;

        try{
            Constructor nameConstructor = individualsClass.getConstructor(String.class, int.class, BigDecimal.class);
            nameConstructor.setAccessible(true);
            System.out.println(nameConstructor);

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
        catch(NoSuchFieldException | NoSuchMethodException ex){
            ex.printStackTrace();
        }
    }
}