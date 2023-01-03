package oneday11.Demo2;

/*
在多态的代码当中，成员方法的访问规则是：
    看new的是谁，就优先用谁，没有则向上找。

口诀：编译看左边，运行看右边。

对比一下：
成员变量：编译看左边，运行还看左边。
成员方法：编译看左边，运行看右边。
 */

public class Demo02Multi {
    public static void main(String[] args) {
        Demo2Father Demo2MutilTest = new Demo2Son(); // 多态
        Demo2MutilTest.methodMulti(); // 父子都有，优先用子；
        Demo2MutilTest.methodDemo1Father();  // 子类没有，父类有向上找到父类
    }
}
