package oneday8;

import java.util.ArrayList;
import java.util.Arrays;
/*
* java.util.Arrays;实现数组的操作
* public static String toString:将参数数组变成字符串
* public static void sort(数组)；默认升序
* 注意事项：
* 1.如果是数值，sort默认按照升序从小到大
* 2.字符串sort默认字母升序
* */
public class Array_Demo4 {

//    public static String toString(int[] a) :返回指定数组内容的字符串表示形式。
    public static void main(String[] args) {

    // 创建新的数组
    ArrayList<Integer>  array2 = new ArrayList<>();
        // 定义数组
    int[] arr1 = {24, 7, 5, 48, 4, 46, 35, 11, 6, 2};
    System.out.println("地址值："+arr1);
    //数组内容转换为字符串
    String s = Arrays.toString(arr1);
    //打印字符串输出内容
    System.out.println("转换为字符串的值："+ s);

    Arrays.sort(arr1);
    String s1 = Arrays.toString(arr1);
    System.out.println("正序排序后的操作："+ s1);

    //倒序排序
    for (int i = arr1.length-1; i >=0 ; i--) {
        array2.add(arr1[i]);
    }
    System.out.println("倒序排序后的操作："+ array2);

    }
}

/*
* array2如何转换成字符串数组
* */