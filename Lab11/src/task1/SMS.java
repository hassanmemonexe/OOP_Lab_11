package task1;

public class SMS extends Message{

    long recipientContactNo;

    SMS(String text, long recipientContactNo) {
        super(text);
        this.recipientContactNo = recipientContactNo;
    }

    public long getContactNo(){
        return recipientContactNo;
    }



    @Override
    public String toString(){
        return "\nrecipient: " + this.recipientContactNo + "\ntext: " + this.text;
    }

}
