package oneday9;

public class Demo4 {

    public static void main(String[] args) {
        Demo4_Phone phone = new Demo4_Phone();
        phone.call();
        phone.send();
        phone.show();
        System.out.println("______________");
//        初始化不同的类调用不同的类的值
        Demo4_NewPhone newPhone = new Demo4_NewPhone();
        newPhone.call();
        newPhone.send();
        newPhone.show();


    }
}
