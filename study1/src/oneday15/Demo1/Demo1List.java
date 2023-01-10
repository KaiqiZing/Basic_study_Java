package oneday15.Demo1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/*
    java.util.List接口 extends Collection接口
    List接口的特点:
        1.有序的集合,存储元素和取出元素的顺序是一致的(存储123 取出123)
        2.有索引,包含了一些带索引的方法
        3.允许存储重复的元素

    List接口中带索引的方法(特有)
        - public void add(int index, E element): 将指定的元素，添加到该集合中的指定位置上。
        - public E get(int index):返回集合中指定位置的元素。
        - public E remove(int index): 移除列表中指定位置的元素, 返回的是被移除的元素。
        - public E set(int index, E element):用指定元素替换集合中指定位置的元素,返回值的更新前的元素。
    注意:
        操作索引的时候,一定要防止索引越界异常
        IndexOutOfBoundsException:索引越界异常,集合会报
        ArrayIndexOutOfBoundsException:数组索引越界异常
        StringIndexOutOfBoundsException:字符串索引越界异常
 */
public class Demo1List {

    public static void main(String[] args) {

//        ListMethod1();

        LinkedDemo1();

    }

    private static void ListMethod1(){
        List<String> list1 = new ArrayList<String>();
        list1.add("123");
        list1.add("测试内容");
        System.out.println("第一次添加测试："+ list1);

        list1.add(1,"添加元素");
        System.out.println("添加的内容："+list1);

        System.out.println("删除索引位置为2的元素："+list1.remove(2));

        list1.set(0,"修改元素");
        System.out.println("指定位置修改元素："+list1);


        // 遍历列表集合
        for (int i = 0; i <list1.size() ; i++) {
            System.out.println("遍历的结果："+list1.get(i));

        }

    }
    private static void LinkedDemo1(){
        LinkedList<String> link = new LinkedList<String>();
        link.addFirst("abc1");
        link.addFirst("abc2");
        System.out.println("初次添加元素："+ link);
        System.out.println(link.getFirst());
        Iterator<String> it = link.iterator();
        while (it.hasNext()){
            System.out.println("遍历数据：" + it.next());
        }

        while (!link.isEmpty()){
            System.out.println("堆栈操作先进后出原则："+ link.pop());  // 弹出集合中的栈顶元素
        }
        System.out.println("pop后的结果："+link);
    }
}
