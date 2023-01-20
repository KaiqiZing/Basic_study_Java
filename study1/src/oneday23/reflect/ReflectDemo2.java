package oneday23.reflect;

import oneday23.domain.Person;

import java.io.File;
import java.lang.reflect.Field;

public class ReflectDemo2 {

    /*
     Class对象功能：
     * 获取功能：
     1. 获取成员变量们
     * Field[] getFields()
     * Field getField(String name)

     * Field[] getDeclaredFields()
     * Field getDeclaredField(String name)
     2. 获取构造方法们
     * Constructor<?>[] getConstructors()
     * Constructor<T> getConstructor(类<?>... parameterTypes)

     * Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
     * Constructor<?>[] getDeclaredConstructors()
     3. 获取成员方法们：
     * Method[] getMethods()
     * Method getMethod(String name, 类<?>... parameterTypes)

     * Method[] getDeclaredMethods()
     * Method getDeclaredMethod(String name, 类<?>... parameterTypes)

     4. 获取类名
     * String getName()
     */

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class personClass = Person.class;
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("==========");
        Field a = personClass.getField("a");
        // 获取到成员变量a的值，因为a.get()内部需要传入对象；所以需要创建Person对象p1并返回Object

        Person p1 = new Person();
        Object value = a.get(p1);
        System.out.println(value);

        // 设置value
        a.set(p1, "张珊珊");
        System.out.println(p1);
        System.out.println("=========");
        Field[] declaredFileds = personClass.getDeclaredFields();// 获取所有成员变量，不考虑修饰符；
        for (Field declaredFiled : declaredFileds) {
            System.out.println("获取所有成员变量："+ declaredFiled);
        }

        Field d = personClass.getDeclaredField("d");
        //忽略访问权限修饰符的安全检查
        d.setAccessible(true);
        Object value2 = d.get(p1);
        System.out.println(value2);
    }
}
