package oneday12.Demo1;
/*
* 当final类关键字用来修饰一个类的时候，格式：
* public final class 类名称(){
*       //
* }
* final类中的所有成员方法都无法进行重写且不能有任何子类；
*
* */
public final class MyFinalClass {
    public void method(){
        System.out.println("方法执行！！！");

    }
}
