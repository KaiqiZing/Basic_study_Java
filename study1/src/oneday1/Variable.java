package oneday1;

/*
Java数据类型分为两大类：
1.基本数据类型：整数，浮点数，字符，布尔；
2.引用数据类型： 类，数组，接口；
long类型：建议数据后加L表示。 float类型：建议数据后加F表示。
* */

public class Variable {
    public static void main(String[] args) {
        // 数据类型  变量名 = 数据值；

        // 定义字节类型变量
        byte b = 100;
        System.out.println(b);

        //定义短整类型变量
        short s = 1000;
        System.out.println(s);

        // 定义整型变量
        int i = 12345;
        System.out.println(i);

        // 定义长整型变量
        long l = 123243254L;
        System.out.println(l);

        //定义单精度浮点型变量
        float f = 1.2F;
        System.out.println(f);

        //定义双精度浮点型变量
        double d = 3.3;
        System.out.println(d);

        //定义布尔型变量
        boolean bool = false;
        System.out.println(bool);

        //定义字符型变量
        char c = 'A';
        System.out.println(c);
    }
}
