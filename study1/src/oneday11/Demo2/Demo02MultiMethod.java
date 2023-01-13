package oneday11.Demo2;

public class Demo02MultiMethod {
    public static void main(String[] args) {
        /*访问成员变量的两种方法：
            1、直接通过对象名称访问成员变量==看等号左边是谁，优先用谁，没有则向上找；
            2、直接通过成员方法访问成员变量：看该方法属于谁，优先用谁，没有则向上找；

        * */

        Demo2Father test = new Demo2Son();
        System.out.println("看等号左边是谁优先用谁："+ test.num);
        System.out.println("==========");


        /*如果子类没有覆盖重写，则属于父类，否则输出子类*/
        test.shownum();
    }
}
