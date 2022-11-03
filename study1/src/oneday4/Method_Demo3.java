package oneday4;
/*
方法重载：在同一个类中，可以存在一个以上的同名方法，只要参数列表不同即可，与修饰符和返回值类型无关；
参数列表：个数不同，数据类型不同，顺序不同；
重载方法调用：JVM通过方法的参数列表，调用不同的方法；
 */
public class Method_Demo3 {
    public static void main(String[] args) {
        //定义不同数据类型的变量
        byte a = 10;
        byte b = 20;
        short c = 10;
        short d = 20;
        int e = 10;
        int f = 10;
        long g = 10;
        long h = 20;
        System.out.println(compare(a, b));
        System.out.println(compare(c, d));
        System.out.println(compare(e, f));
        System.out.println(compare(g, h));
    }
    public static boolean compare(byte a, byte b){
        System.out.println("====byte=====");
        return a ==b;
    }

    public static boolean compare(short a, short b){
        System.out.println("====short====");
        return a ==b;
    }

    public static boolean compare(long a, long b){
        System.out.println("====long====");
        return a ==b;
    }

    public static boolean compare(int a, int b){
        System.out.println("====int====");
        return a ==b;
    }
}
