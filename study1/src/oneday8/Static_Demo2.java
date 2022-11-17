package oneday8;


/*
* 一旦使用static修饰成员方法，那么就是静态方法，静态方法不属于对象，属于类的。
* 如果没有static关键字，那么必须首先创建对象，然后通过对象才能使用它；
* 静态变量： 类名称.静态变量
* 静态方法： 类名称.静态方法()
*
* 注意事项：
* 1.静态不能直接访问非静态
* 因为在内存当中现有静态内容，再有非静态内容；故先人不知道后人，后人知道先人；
* 2.静态方法不能使用this;
*
* */


public class Static_Demo2 {
    public static void main(String[] args) {
        Static_demo1 obj = new Static_demo1();
        obj.method();
//        obj.methodStatic(); // 不推荐使用
        Static_demo1.methodStatic();


        // 自己的静态方法访问方式：直接类.静态方法() 或 静态方法()
        myMethod();
        Static_Demo2.myMethod();
    }

    public static void myMethod(){
        System.out.println("自己的方法！");

    }


}
