package oneday15;

import java.security.PublicKey;
import java.util.HashSet;
import java.util.LinkedHashSet;

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

    }
}
