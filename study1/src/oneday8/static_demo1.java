package oneday8;

import java.util.ArrayList;

/*
* static关键字的使用，可以用来修饰成员变量和成员方法，被修饰的成员是属于类的而不是单单是属于某个对象；
* 当static修饰成员变量时，该变量成为类变量，该类的每个对象都共享同一个类变量的值，任何对象都可以更改该类变量的值，也可以在不创建该类对象的情况下对类变量进行操作
* */
public class static_demo1 {
    private String name;
    private int age;
    private int sid;

    public static int nunmberofstudent = 0;    //类变量
    public static_demo1(String name, int age){
        this.name = name;
        this.age = age;
        this.sid = ++nunmberofstudent;

    }
    public void show(){
        System.out.println("student_name:"+ name + "age:" + age + "sid=" +sid);
    }

    /*使用static关键字修饰的成员方法--静态方法；
     * 静态方法可以直接访问类变量和静态方法；
     * 静态方法不能直接访问普通成员变量和成员方法，成员方法可以直接访问类变量或静态方法；
     * 静态方法中不能使用this关键字；
     * */
    public static void shownum(){
        System.out.println("num:"+nunmberofstudent);
    }

    /*静态代码块：定义在成员位置，使用static修饰代码快{}。优先于main方法和构造方法的执行*/
    public static int number;
    public static ArrayList<String> list;
    static {
        number =2;
        list = new ArrayList<String>();
        list.add("张三");
        list.add("李四");
    }

    public static void main(String[] args) {
        static_demo1 s1 = new static_demo1("zhangsan", 23);
        s1.show();

        /*静态方法的调用*/
        System.out.println(static_demo1.nunmberofstudent);  // 访问来变量；
        static_demo1.shownum();  // 调用静态方法；

        /*静态代码块的使用*/
        System.out.println(static_demo1.number);
        System.out.println(static_demo1.list);
    }

}
