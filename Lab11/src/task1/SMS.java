package task1;

public class SMS extends Message{

    int recipientContactNo;

    SMS(String text) {
        super(text);
    }

    public int getContactNo(){
        return recipientContactNo;
    }

    public void setContactNo(int recipientContactNo){
        this.recipientContactNo = recipientContactNo;
    }

    @Override
    public String toString(){
        return "\nrecipient: " + this.recipientContactNo + "\ntext: " + this.text;
    }

}
