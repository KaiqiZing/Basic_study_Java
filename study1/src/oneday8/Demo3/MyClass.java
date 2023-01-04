package oneday8.Demo3;

public class MyClass {
    // 成员变量
    int num;
    // 静态变量
    static int numStatic;
    // 成员方法
    public void method(){
        System.out.println("成员方法");
        System.out.println("成员方法访问成员变量"+ num);
        System.out.println("成员方法访问静态变量"+ numStatic);

    }

    public static void methodStatic(){
        System.out.println("这是静态方法");
        System.out.println("静态方法访问静态变量");
        /*
        * 1.静态方法不能直接访问非静态；
        * 2.静态方法中不能使用this关键字；
        * */
    }

}
