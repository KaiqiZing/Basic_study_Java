package oneday16.Demo2;

import java.util.Collections;
import java.util.Hashtable;
import java.util.LinkedHashMap; // 底层原理：哈希表+链表（记录元素的顺序）

public class LinkedHashMapDemo {

    public static void main(String[] args) {
        method();
        hashtabledemo();

    }
    public static void method(){
        LinkedHashMap<String, String> map = new LinkedHashMap<>();

        map.put("a","a");
        map.put("a","b");
        map.put("c", "c");
        map.put("b","b");
        System.out.println(map); // key 不允许重复，有序；
    }

    public static void hashtabledemo(){
        /*Hashtable:底层是一个哈希表，是一个县城安全的集合，是单线程集合速度慢，
        * 不能存储null键值对*/
        Hashtable<String, String> table = new Hashtable<>();
        table.put("12","12");
        System.out.println(table);
//        table.put(null, "1"); // 空指针异常
//        table.put(null, null);// 空指针异常
//        table.put("1",null);// 空指针异常


    }
}
