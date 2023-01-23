package oneday23.reflect;

import oneday23.domain.Person;

import java.lang.reflect.Constructor;

public class ReflectDemo3 {

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
        Constructor constructor = personclass.getConstructor(String.class, int.class);
        Object person = constructor.newInstance("张珊", 22);
        System.out.println("获取到构造方法:"+ person);
        System.out.println("=============================");

        Constructor[] constructors1 = personclass.getConstructors();
        for (Constructor constructor2 : constructors1) {
            System.out.println(constructor2);
        }

        Constructor constructor2 = personclass.getConstructor();
        Object person1 = constructor2.newInstance();
        System.out.println(person1);
        Object test = personclass.newInstance();
        System.out.println(test);

    }


}