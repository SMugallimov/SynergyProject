package block2.homework2_8;

public class BlockedTransactions extends RuntimeException{

    public BlockedTransactions(String message){
        super(message);
    }
}