package task1;

public class Test {
    public static void main(String[] args) {

        Email email = new Email("Hello","Hassan","Faisal","testing email");
        SMS sms = new SMS("Hi", 8218938);





        System.out.println(email.toString());

        System.out.println(sms.toString());

        System.out.println("contact no: " + sms.getContactNo());
    }
}
