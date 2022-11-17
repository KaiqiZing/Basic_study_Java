package oneday8;

import java.util.ArrayList;

/*
* static关键字的使用，可以用来修饰成员变量和成员方法，被修饰的成员是属于类的而不是单单是属于某个对象；
* 当static修饰成员变量时，该变量成为类变量，该类的每个对象都共享同一个类变量的值，任何对象都可以更改该类变量的值，
* 也可以在不创建该类对象的情况下对类变量进行操作
* */
public class Static_demo1 {

    int num; //成员变量
    static  int numStatic; //静态变量

    //成员方法


    public void method(){
        System.out.println("这是一个成员方法");
        System.out.println("成员方法访问成员变量："+num);
        System.out.println("成员方法访问静态变量:"+numStatic);

    }

    //静态方法
    public static void methodStatic(){
        System.out.println("这是一个静态方法");
        System.out.println("静态方法访问静态变量："+numStatic);
//        System.out.println("静态方法不能访问非静态变量+"num);
    }
}
