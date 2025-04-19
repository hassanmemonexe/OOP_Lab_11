package task1;

public class Email extends Message {

    String sender, receiver, subject;

    Email(String text){
        super(text);
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return  "\nsender: " + this.sender + "\nreceiver: "  + this.receiver + "\nsubject: " + this.subject + "\ntext: " + this.text;
    }


}
