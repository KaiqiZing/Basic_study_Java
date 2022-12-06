package oneday10;
/*
 "接口的多实现"一个类只能继承一个父类。而对于接口而言，一个类是可以实现多个接口的，这叫做接 口的多实现。并且，一个类能继承一个父类，同时实现多个接口
* 接口中，有多个抽象方法时，实现类必须重写所有抽象方法。如果抽象方法有重名的，只需要重写一次
* 接口中，有多个默认方法时，实现类都可继承使用。如果默认方法有重名的，必须重写一次,默认方法不必须重写，除了重名以外；
* 接口中，存在同名的静态方法并不会冲突，原因是只能通过各自接口名访问静态方法。
*
* */
public class Demo2 implements Demo2InterfaceA, Demo2InterfaceB{

    @Override
    public void methodA() {

    }

    @Override
    public void methodB() {

    }

    @Override
    public void methodtest() {
        System.out.println("show");

    }

    @Override
    public void methoddefault(){
        System.out.println("default method");
    }
}
