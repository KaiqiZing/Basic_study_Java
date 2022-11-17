package oneday8;

import java.util.Scanner;

/*统计字符个数*/
public class String_Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串数据：");
        String s = sc.nextLine();

        int bigcount =0;
        int samllcount = 0;
        int numbercout = 0;

        for (int x=0; x <s.length(); x++){

            // 索引赋值操作,遍历字符串，得到每一个字符；
            // char charAt(int index):获取指定索引处的字符
            char ch = s.charAt(x);
            if (ch>='A'&&ch<='Z'){
                bigcount++;
            }else if (ch>='a'&&ch<='z'){
                samllcount++;
            }else if (ch>='0'&&ch<='9'){
                numbercout++;
            }else{
                System.out.println("非法字符"+ch);
            }

        }

        System.out.println("大写字符"+bigcount);
        System.out.println("小写字符"+samllcount);
        System.out.println("数字字符"+numbercout);
    }
}
