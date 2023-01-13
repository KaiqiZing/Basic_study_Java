package oneday11.Demo1;
/*
代码当中体现多态性，其实就是一句话：父类引用指向子类对象。

格式：
父类名称 对象名 = new 子类名称();
或者：
接口名称 对象名 = new 实现类名称();

多态：是指同一行为，具有多个不同表现形式
1. 继承或者实现【二选一】
2. 方法的重写【意义体现：不重写，无意义】
3. 父类引用指向子类对象【格式体现】

    1.当使用多态方式调用方法时，首先检查父类中是否有该方法，如果没有，则编译错误；如果有，执行的是子类重写
后方法。
 */
public class Demo01Multi {
    public static void main(String[] args) {
        Demo1Father Demo1MutilTest = new Demo2Son();
        Demo1MutilTest.methodMulti();
        Demo1MutilTest.methodDemo1Father();
    }
}
