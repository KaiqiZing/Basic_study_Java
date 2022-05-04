package oneday7;
import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;
public class Class_Demo1 {

    /*创建键盘录入数据的对象*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*创建一个随机数*/
        Random rd = new Random();
//        for (int i = 0; i<3; i++){
//            int number = rd.nextInt(10);
//            System.out.println("生成随机数："+ number);
//        }

        /*获取1-n的随机数*/
        System.out.println("请输入n位随机数");
        int n = sc.nextInt();
        for (int i = 0; i<n; i++){
            int number = rd.nextInt(n);
            System.out.println("生成随机数"+n+"位置随机数："+ number);
        }



        //接收数据
//        System.out.println("请录入第一个数据");
//        int a = sc.nextInt();
//
//        System.out.println("请录入第二个数据：");
//        int b = sc.nextInt();
//
//        int sum = a + b;
//
////        输出数据
////        System.out.println("sum=" + sum);
//
//        /*取最大最小值*/
//        System.out.println("请输入第三个数据：");
//        int c = sc.nextInt();
//        int temp = (a > b ? a : b);
//        int max = (temp > c ? temp : c);
//
//        System.out.println("最大值是："+max);

    }
}
