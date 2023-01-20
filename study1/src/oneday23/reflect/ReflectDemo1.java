package oneday23.reflect;


import oneday23.domain.Person;
import oneday23.domain.Student;

public class ReflectDemo1 {
    /*
     获取Class对象的方式：
     1. Class.forName("全类名")：将字节码文件加载进内存，返回Class对象
     2. 类名.class：通过类名的属性class获取
     3. 对象.getClass()：getClass()方法在Object类中定义着。

     */

    public static void main(String[] args) throws ClassNotFoundException {
        Class cls1 = Class.forName("oneday23.domain.Person");
        System.out.println(cls1);

        // 类名.class
        Class cls2 = Person.class;
        System.out.println(cls2);

        // 对象名
        Person p1 = new Person();
        Class cls3 = p1.getClass();
        System.out.println(cls3);

        System.out.println(cls1==cls2);
        System.out.println(cls1==cls3);

        Class c = Student.class;
        System.out.println(cls1==c);

        /*同一个字节码文件(*.class)在一次程序运行过程中，只会被加载一次，不论通过哪一种方式获取的Class对象都是同一个。
        * 同一字节码对象指向相同等于true，不同字节码指向不同等于false*/

    }
}
