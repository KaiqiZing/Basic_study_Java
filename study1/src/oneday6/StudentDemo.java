package oneday6;
/*
* 类需要创建一个对象才可以使用：
* 1.导包==指出需要使用的类在什么位置；
import 包名称.类名称；
对于和当前类属于同一个包的情况，可以省略导包语句不写；
* 2.创建：
* 类名称 对象名 = new 类名称();
* Student stu = new Student();
*
*3.使用分为两种情况：
* 使用成员变量：对象名.成员变量名
* 使用成员方法：对象名.成员方法名
*
* */

public class StudentDemo {

    public static void main(String[] args) {

        //1.导包
        //2.创建
        Student stu = new Student();
        // 3.使用成员变量==对象名.成员变量名
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println("+++++++++");

        // 改变对象中的成员变量数值内容，将右侧的字符串赋值给stu对象当中的name成员变量
        stu.name = "nihao";
        stu.age = 18;
        System.out.println(stu.age);
        System.out.println(stu.name);
        System.out.println("============");

        // 使用对象的成员方法格式
        stu.eat();
        stu.sleep();
        stu.study();

    }

}
