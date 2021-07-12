package homework13;

public class NotEnoughMoneyException extends Exception{
    public NotEnoughMoneyException(String s){
        System.out.println("Withdrawal is declined. Not enough money on your account!");
    }
}