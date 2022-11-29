package oneday15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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

        while (!link.isEmpty()){
            System.out.println("堆栈操作先进后出原则："+ link.pop());  // 弹出集合中的栈顶元素
        }
        System.out.println("pop后的结果："+link);
    }
}
