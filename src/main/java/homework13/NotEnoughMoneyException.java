package homework13;

public class NotEnoughMoneyException extends RuntimeException{
    public NotEnoughMoneyException(String message){
        super(message);
    }
}