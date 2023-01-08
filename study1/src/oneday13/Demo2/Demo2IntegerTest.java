package oneday13.Demo2;
/*
    基本类型与字符串类型之间的相互转换
    基本类型->字符串(String)
        1.基本类型的值+""  最简单的方法(工作中常用)
        2.包装类的静态方法toString(参数),不是Object类的toString() 重载
            static String toString(int i) 返回一个表示指定整数的 String 对象。
        3.String类的静态方法valueOf(参数)
            static String valueOf(int i) 返回 int 参数的字符串表示形式。
    字符串(String)->基本类型
        使用包装类的静态方法parseXXX("字符串");
            Integer类: static int parseInt(String s)
            Double类: static double parseDouble(String s)
 */
public class Demo2IntegerTest {
    public static void main(String[] args) {
        // 基本类型转字符串
        int test1 = 100;
        String s1 = test1+"";
        System.out.println("字符串和基本类型拼接："+ s1+200);

        String s2 = Integer.toString(1000);
        System.out.println(s2+300);

        String s3 = String.valueOf(300);
        System.out.println(s3+300);


        //字符串转基本类型
        int i = Integer.parseInt(s1);
        System.out.println(i-10);

        int a = Integer.parseInt("qa"); //NumberFormatException
        System.out.println(a);


    }
}
