package oneday7;

import java.util.Scanner;
/*
*
获取键盘输入的一个int数字：int num = sc.nextInt();
获取键盘输入的一个字符串：String str = sc.next();
* */
public class ScannerDemo {
    public static void main(String[] args) {
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        //接受数据
        System.out.println("请输入一个数据：");
        int i  = sc.nextInt(); // 将输入的信息的下一个标记扫描为一个int value
        System.out.println("输入的数据是:"+i);

        int a  = sc.nextInt();
        System.out.println("输入的数据是:"+a);

        int sum = i + a;
        System.out.println("sum:"+sum);

        int c = sc.nextInt();
        System.out.println("请输入一个数据：");
        int temp = (a > c ? a : c);
        int max = (temp > i ? temp:i);
        System.out.println("最大值是："+ max);


        String strtest = sc.next();
        System.out.println("输入的字符串是："+ strtest);

    }
}
