package task1;

public class Email extends Message {

    String sender, receiver, subject;

    Email(String text,String sender,String receiver, String subject){
        super(text);
        this.sender = sender;
        this.receiver = receiver;
        this.subject = subject;
    }

    public void setSender(String sender) {

    }

    public void setReceiver(String receiver) {

    }

    public void setSubject(String subject) {

    }

    @Override
    public String toString() {
        return  "\nsender: " + this.sender + "\nreceiver: "  + this.receiver + "\nsubject: " + this.subject + "\ntext: " + this.text;
    }


}
