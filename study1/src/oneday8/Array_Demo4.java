package oneday8;

import java.util.Arrays;

public class Array_Demo4 {

//    public static String toString(int[] a) :返回指定数组内容的字符串表示形式。
    public static void main(String[] args) {
    int[] arr1 = {24, 7, 5, 48, 4, 46, 35, 11, 6, 2};
    System.out.println("地址值："+arr1);

    String s = Arrays.toString(arr1);
    System.out.println("转换为字符串的值："+ s);

    Arrays.sort(arr1);
    String s1 = Arrays.toString(arr1);
    System.out.println("排序后的操作："+ s1);


    //定义随机字符串
        String lines = "dadadadaedDSDWDSASA";
        char[] chars = lines.toCharArray();
        Arrays.sort(chars);
        for (int i=0; i<=chars.length-1; ++i){
            System.out.println(chars[i]);
        }
    }
}
