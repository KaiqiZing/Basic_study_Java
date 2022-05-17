package oneday9;
/*
* 在父类的继承关系中，如果成员变量重名，则创建子类对象时，访问有两种方式：
* 1、直接通过子类对象访问成员变量；  等号左边是谁就优先使用谁，没有则向上找；
* 2、间接通过成员方法访问成员变量；  该方法属于谁，就优先用谁，没有则向上找；
*
* 在继承关系中，创建子类对象，访问成员方法规则：创建对象是谁，就优先使用谁，若无则向上找；
* Notice： 无论是成员方法还是成员变量，如果没有都是向上找父类，绝对不会向下找
*   */
public class Demo2 {
    public static void main(String[] args) {
        Demo2_Father father = new Demo2_Father();
        System.out.println(father.numfa);
        System.out.println(father.num);

        /*son*/
        Demo2_Son son = new Demo2_Son();
        System.out.println(son.son_num);

        // 等号左边是谁就优先使用谁，没有则向上找
        System.out.println(father.num);
        System.out.println(son.num);
        System.out.println("+++++++++");
        son.methodson();
        son.methodfather();
        /*
        局部变量：         直接写成员变量名
        本类的成员变量：    this.成员变量名
        父类的成员变量：    super.成员变量名
        */
        son.method_son1();

        son.method_son2();
        son.method_father2();
        son.method(); // 创建的是new子类对象，所以优先用子类方法
    }
}
