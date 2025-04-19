package task1;

public class Message {
    String text;

    Message(String text){
        this.text = text;
    }

    @Override
    public String toString() {
        return this.text;
    }

    public void setText(String text){
        this.text = text;
    }
}
