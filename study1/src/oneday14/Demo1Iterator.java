package oneday14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
/*
    java.util.Iterator接口:迭代器(对集合进行遍历)
    有两个常用的方法
        boolean hasNext() 如果仍有元素可以迭代，则返回 true。
            判断集合中还有没有下一个元素,有就返回true,没有就返回false
        E next() 返回迭代的下一个元素。
            取出集合中的下一个元素
    Iterator迭代器,是一个接口,我们无法直接使用,需要使用Iterator接口的实现类对象,获取实现类的方式比较特殊
    Collection接口中有一个方法,叫iterator(),这个方法返回的就是迭代器的实现类对象
        Iterator<E> iterator() 返回在此 collection 的元素上进行迭代的迭代器。

    迭代器的使用步骤(重点):
        1.使用集合中的方法iterator()获取迭代器的实现类对象,使用Iterator接口接收(多态)
        2.使用Iterator接口中的方法hasNext判断还有没有下一个元素
        3.使用Iterator接口中的方法next取出集合中的下一个元素
 */
public class Demo1Iterator {
    public static void main(String[] args) {
        InteratorDemo1();

    }

    public static void InteratorDemo1(){
        ArrayList<String> String_list = new ArrayList<>();
        Collections.addAll(String_list, "abc", "bbb", "ccc");
        Iterator<String> it = String_list.iterator();
        while (it.hasNext()){
            String e = it.next();
            System.out.println("hashNext方法："+ e);
        }
        System.out.println("==================");
        for (Iterator<String> it2 = String_list.iterator(); it2.hasNext();){
            String e2 = it2.next();
            System.out.println("forIterator方法："+e2);
        }
    }



}
