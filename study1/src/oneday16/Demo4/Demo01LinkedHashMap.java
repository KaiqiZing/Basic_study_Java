package oneday16.Demo4;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;

/*
    java.util.LinkedHashMap<K,V> entends HashMap<K,V>
    Map 接口的哈希表和链接列表实现，具有可预知的迭代顺序。
    底层原理:
        哈希表+链表(记录元素的顺序)
 */
public class Demo01LinkedHashMap {
    public static void main(String[] args) {
        method01();
    }


    public static void method01(){
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("a","b");
        map1.put("b","b");
        map1.put("c","b");
        map1.put("d","c");
        System.out.println("key不重复，无序："+map1);

        LinkedHashMap<String, String> linked1 = new LinkedHashMap<>();
        linked1.put("a","a");
        linked1.put("c","c");
        linked1.put("b","b");
        linked1.put("a","d");
        System.out.println("key不可重复，有序："+linked1);
    }


    /*
    java.util.Hashtable<K,V>集合 implements Map<K,V>接口

    Hashtable:底层也是一个哈希表,是一个线程安全的集合,是单线程集合,速度慢
    HashMap:底层是一个哈希表,是一个线程不安全的集合,是多线程的集合,速度快

    HashMap集合(之前学的所有的集合):可以存储null值,null键
    Hashtable集合,不能存储null值,null键

    Hashtable和Vector集合一样,在jdk1.2版本之后被更先进的集合(HashMap,ArrayList)取代了
    Hashtable的子类Properties依然活跃在历史舞台
    Properties集合是一个唯一和IO流相结合的集合
 */
    public static void Demo2HashTable(){
        HashMap<String, String> map2 = new HashMap<>();
        map2.put(null,"a");
        map2.put("b",null);
        map2.put(null,null);
        System.out.println(map2);//{null=null, b=null}

        Hashtable<String, String> table = new Hashtable<>();
        //table.put(null,"a");//NullPointerException
        //table.put("b",null);//NullPointerException
        table.put(null,null);//NullPointerException

    }



}

