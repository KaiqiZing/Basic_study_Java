package oneday1;
/*
数据类型 关键字
字节型 byte
短整型 short
整型 int(默认) 长整型 long 单精度浮点数 float 双精度浮点数 double(默认) 字符型 char
布尔类型 boolean
内存占用 取值范围
1个字节 -128~127
2个字节 -32768~32767
4个字节 -231次方~2的31次方-1 8个字节 -2的63次方~2的63次方-1 4个字节 1.4013E-45~3.4028E+38 8个字节 4.9E-324~1.7977E+308 2个字节 0-65535
1个字节 true，false
 */
// Java数据类型分为两大类：
// 1.基本数据类型：整数，浮点数，字符，布尔；2.引用数据类型： 类，数组，接口；
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
