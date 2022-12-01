package oneday16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class CollectionDemo {
    public static void main(String[] args) {

        Demo1();
        comparetorDemo1();


    }

    public static void Demo1(){
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        Collections.addAll(list1, 1,2,4,8,5);
        System.out.println("集合工具类之添加元素："+list1);

        Collections.sort(list1);
        System.out.println("排序后的结果："+ list1);
    }

    public static void comparetorDemo1(){

        ArrayList<String> list1 = new ArrayList<String>();
        Collections.addAll(list1, "abc", "cba", "bac");


        Collections.sort(list1, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
//                return o2.charAt(0) - o1.charAt(0); // 降序操作
                return o1.charAt(0) - o2.charAt(0);  // 升序操作

            }
        });
        System.out.println("升序操作："+ list1);

    }
}
