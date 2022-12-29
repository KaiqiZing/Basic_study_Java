package oneday6;
/*
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
        创建一个对象*/
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
