package oneday15.Demo2;

import java.security.PublicKey;
import java.util.HashSet;
import java.util.LinkedHashSet;

/*
    java.util.Set接口 extends Collection接口
    Set接口的特点:
        1.不允许存储重复的元素
        2.没有索引,没有带索引的方法,也不能使用普通的for循环遍历
    java.util.HashSet集合 implements Set接口
    HashSet特点:
         1.不允许存储重复的元素
         2.没有索引,没有带索引的方法,也不能使用普通的for循环遍历
         3.是一个无序的集合,存储元素和取出元素的顺序有可能不一致
         4.底层是一个哈希表结构(查询的速度非常的快)
 */
public class Demo1Set {
    public static void main(String[] args) {
        HashSetDemo();
        LinkedHashSetTest();

    }

    private static void HashSetDemo(){
        HashSet<String> settest1 = new HashSet<String>();

        settest1.add("abc");
        settest1.add("abc");
        settest1.add("123");
        settest1.add("456");
        System.out.println(settest1);  // 无序不重复

    }

    private static void LinkedHashSetTest(){
        LinkedHashSet<String> linked = new LinkedHashSet<String>();
        linked.add("123");
        linked.add("123");
        linked.add("789");
        linked.add("456");
        System.out.println("LinkedHashSetTest内容测试："+linked); // 有序不重复
        for (String i:linked){
            System.out.println("遍历后的结果："+ i);
        }

    }
}
