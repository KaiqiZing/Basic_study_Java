package oneday7;
import java.util.ArrayList;
/*
对象数组：
import java.util.ArrayList;--是大小可变的数组实现，存储在内的数据成为元素，此类提供一些方法来操作内部存储元素，其中可以不断添加元素，其大小也是自动增长；
存储基本数据类型：
ArrayList对象不能存储基本数据类型，只能存储对应的包装类型，其中Integer 和 Character需要特殊记忆，其他基本类型首字母大写即可
*/
public class Class_Demo3_Arraylist {
    public static void main(String[] args) {
        /*创建数组*/
        ArrayList<String> list = new ArrayList<>();
        /*创建数组对象*/
        String s1 = "你好";
        String s2 = "我好";
        String s3 = "大家好";
        System.out.println(list);   //空值

        /*将数组对象添加到元素集合当中*/
        list.add(s1);
        list.add(s2);
        list.add(s3);
        System.out.println("打印添加数组对象后的结果集："+list);

        /*对象数组的基本操作：
        * 1.添加元素； 2.返回指定索引处元素；3.返回集合中元素的个数；4.删除指定索引处元素；5.遍历输出*/
        list.add("hello");
        System.out.println("添加元素打印结果："+list);
        System.out.println("返回指定索引处的元素："+ list.get(0));
        System.out.println("返回集合中的元素个数："+list.size());
        System.out.println("删除指定索引出的元素："+list.remove(0));

        for (int i=0; i<list.size(); i++){
            System.out.println("遍历输出结果是："+ list.get(i));
        }

        /*整数类型*/
        ArrayList<Integer> int_list = new ArrayList<>();
        int_list.add(1);
        int_list.add(2);
        System.out.println(int_list);


    }
}
