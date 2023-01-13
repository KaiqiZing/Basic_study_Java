package oneday7.Demo4;
import java.util.ArrayList;
/*
数组的长度不可以发生改变。
但是ArrayList集合的长度是可以随意变化的。

对于ArrayList来说，有一个尖括号<E>代表泛型。
泛型：也就是装在集合当中的所有元素，全都是统一的什么类型。
注意：泛型只能是引用类型，不能是基本类型。

注意事项：
对于ArrayList集合来说，直接打印得到的不是地址值，而是内容。
如果内容是空，得到的是空的中括号：[]
 */
public class Class_Demo3_Arraylist {
    public static void main(String[] args) {
        /*创建数组*/
        ArrayList<String> list = new ArrayList<>();
        /*创建数组对象*/
        String s1 = "你好";
        String s2 = "我好";
        String s3 = "大家好";
        System.out.println("无值："+list);   //空值

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
