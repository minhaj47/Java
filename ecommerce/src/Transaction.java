import java.time.LocalDateTime;
import java.util.UUID;

public class Transaction {
    private final UUID transactionID;
    private final double value;
    private final LocalDateTime creationTime;

    public Transaction(UUID transactionID, double value){
        this.transactionID = transactionID;
        this.value = value;
        this.creationTime = LocalDateTime.now();
    }

    @Override 
    public String toString(){
        return "transactionID = " + transactionID + "\nvalue = " + value + "\ncreationTime = " + creationTime ;
    }
}
