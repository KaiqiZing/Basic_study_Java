package oneday15.Demo2;

import java.util.HashSet;
/*
    HashSet存储自定义类型元素

    set集合报错元素唯一:
        存储的元素(String,Integer,...Student,Person...),必须重写hashCode方法和equals方法

    要求:
        同名同年龄的人,视为同一个人,只能存储一次
 */
public class CustomHashSetDemo {
    public static void main(String[] args) {
        HashSet<CustomHashSetStudent> customhashset = new HashSet<CustomHashSetStudent>();
        CustomHashSetStudent p1 = new CustomHashSetStudent("测试1", 22);
        CustomHashSetStudent p2 = new CustomHashSetStudent("测试1", 22);
        CustomHashSetStudent p3 = new CustomHashSetStudent("测试2", 22);

        customhashset.add(p1);
        customhashset.add(p2);
        customhashset.add(p3);
        System.out.println(customhashset);

        // 重写hashcode and equals
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p1==p2);
        System.out.println("判断两个元素是否相等："+ p1.equals(p2));
        customhashset.add(p1);
        customhashset.add(p2);
        customhashset.add(p3);
        System.out.println("最后只会保留不相同的结果："+ customhashset);


    }
}
