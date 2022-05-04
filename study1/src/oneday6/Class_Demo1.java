package oneday6;
/*
类：
属性： 事物的状态信息；行为：事物能够做什么；
成员变量：对应事物的属性；成员方法：对应事物的行为；
1.一个类可以有多个方法；
2.在创建一个对象的时候，至少要调用一个构造方法，构造方法的名称必须与类同名，一个类可以有多个构造方法；

创建对象：
对象是根据类创建的：1.声明：声明一个对象，包括对象名称和对象类型； 2.实例化：使用关键字new来创建一个对象； 3.初始化 使用new创建的对象时，会调用构造方法初始化对象

源文件声明规则：
1.一个源文件只能有一个public类，但可以用多个非public类；
2.源文件名称应和public类名保持一致，如源文件名Test.java，那么public类名应是Test;
3.如果一个类定义在某个包中，那么package语句应该在源文件的首行；
4.有package语句时，import语句应放在类定义和package之间，若无package语句，import语句应该在源文件中最前面；
5.同一源文件中，不能给不同的类不同的包声明；



 */
public class Class_Demo1 {
/*
    成员变量
*/
    int classdemo1Age;
    /*有参数的构造方法*/
    public Class_Demo1(String  name){
        System.out.println("小狗的名字是:"+name);
    }
    public void setAge(int age){
        classdemo1Age = age;
    }

    public int getAge(){
        System.out.println("小狗的年龄是：" + classdemo1Age);
        return classdemo1Age;
    }

    public static void main(String[] args) {
/*
        创建一个对象
*/
        Class_Demo1 classDemo1 = new Class_Demo1("tommy");
        /*通过方法来设定age*/
        classDemo1.setAge(2);
        /*调用另一个方法来获取age*/
        classDemo1.getAge();
        /*通过对象来访问成员变量*/
        System.out.println("变量的值是："+ classDemo1.classdemo1Age);
        show(classDemo1);  // 引用的传递使用

    }

    public static void show(Class_Demo1 classDemo1){
        System.out.println("测试"+ classDemo1.getAge());
    }

}
