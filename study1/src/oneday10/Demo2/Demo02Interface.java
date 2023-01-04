package oneday10.Demo2;

/*
* 接口默认方法：
*   1.可以通过接口实现类对象直接调用或者接口实现类进行覆盖重写；
*   2 接口中默认方法可以不重写，若实现类重写接口默认方法，则会覆盖掉接口默认方法；
*
* */
public class Demo02Interface {

    public static void main(String[] args) {
        // 创建接口实现类对象
        MyInterfaceDefaultA test_a = new MyInterfaceDefaultA();
        MyInterfaceDefaultB test_b = new MyInterfaceDefaultB();

        test_a.Demo2MethodAbstract();
        test_a.Demo2MethodDefault();
        System.out.println("========================");
        test_b.Demo2MethodAbstract();
        test_b.Demo2MethodDefault();


        // 3. 接口静态方法，不能通过接口实现类对象调用接口当中的静态方法，需要通过接口名称直接调用其中的静态方法；

        MyInterfaceDefault.Demo3MethodStatic();

        // 直接访问接口中的常量
        System.out.println("直接访问接口中的常量:" + MyInterfaceConst.NUM_OF_MY_CLASS);

    }
}
