package oneday23.reflect;

import oneday23.domain.Person;

import java.lang.reflect.Method;

public class ReflectDemo4 {

    /**
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

    public static void main(String[] args) throws Exception {
        Class personclass = Person.class;
        Method getmethod = personclass.getMethod("eat");
        Person p1 = new Person();
        getmethod.invoke(p1);

        Method getmethod2 = personclass.getMethod("eat", String.class);
        getmethod2.invoke(p1, "测试卷");

        System.out.println("+++++++++++++");
        // 获取所有的公共方法；
        Method[] methods = personclass.getMethods();
        for (Method method : methods) {
//            System.out.println("获取到公共方法："+method);
            String name = method.getName();
            System.out.println(name);
        }

        String classname = personclass.getName();
        System.out.println("获取到类名："+ classname);

    }


}
