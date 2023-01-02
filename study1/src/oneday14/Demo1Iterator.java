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
        Demo2();


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



    /*
    增强for循环:底层使用的也是迭代器,使用for循环的格式,简化了迭代器的书写
    是JDK1.5之后出现的新特性
    Collection<E>extends Iterable<E>:所有的单列集合都可以使用增强for
    public interface Iterable<T>实现这个接口允许对象成为 "foreach" 语句的目标。

    增强for循环:用来遍历集合和数组

    格式:
        for(集合/数组的数据类型 变量名: 集合名/数组名){
            sout(变量名);
        }
 */
    private static void Demo2(){
        ArrayList<String> String_list2 = new ArrayList<>();
        Collections.addAll(String_list2, "abc2", "bbb2", "ccc2");
        for (String s :String_list2){
            System.out.println("增强for循环："+ s);
        }
    }



}
