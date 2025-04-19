package task1;

public class TestTask1 {
    public static void main(String[] args) {

        Email email = new Email("this is an email");
        SMS sms = new SMS("this is a SMS");

        email.setSender("Hassan");
        email.setReceiver("Faisal");
        email.setSubject("To test the email class");

        sms.setContactNo(3293);

        System.out.println(email.toString());

        System.out.println(sms.toString());

        System.out.println("contact no: " + sms.getContactNo());
    }
}
