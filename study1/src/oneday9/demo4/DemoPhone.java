package oneday9.demo4;

public class DemoPhone {
    public static void main(String[] args) {
        phone p = new phone();
        p.call();
        p.send();
        p.show();
        System.out.println("=======");

       NewPhone newPhone = new NewPhone();
       newPhone.call();
       newPhone.send();
       newPhone.show();

    }
}
