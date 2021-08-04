package block2.homework2_5;

public class NotEnoughMoneyException extends RuntimeException{
    public NotEnoughMoneyException(String message){
        super(message);
    }
}