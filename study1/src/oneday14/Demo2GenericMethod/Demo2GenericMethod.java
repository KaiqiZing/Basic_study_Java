package oneday14.Demo2GenericMethod;

public class Demo2GenericMethod {

    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();
        gm.method1(10);
        gm.method1("abc");
        gm.method1(8.1);


        //静态方法,通过类名.方法名(参数)可以直接使用
        GenericMethod.method2("静态方法");
        GenericMethod.method2(1);


    }
}
