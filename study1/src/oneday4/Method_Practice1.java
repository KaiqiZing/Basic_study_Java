package oneday4;
/*
* 比较两个数据是否相等
* 参数类型分为别 byte, short, int, long
* */
public class Method_Practice1 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        System.out.println(issame(a,b));

        System.out.println(issame(10, 20));

        System.out.println(issame(10L, 10L ));

        System.out.println(issame((short) 10, (short) 10));
    }

    public static boolean issame(byte a, byte b){
        System.out.println("两个 byte参数的方法执行");
        boolean same;
        if (a==b){
            same = true;
        }else {
            same = false;
        }
        return same;
    }


    public static boolean issame(short a, short b){
        System.out.println("两个short参数的方法执行");

        boolean same = a==b ? true : false;
        return same;
    }

    public static boolean issame(int a, int b){
        System.out.println("两个int参数的方法执行");

        return a ==b;
    }


    public static boolean issame(long a, long b ){
        System.out.println("两个long参数的方法执行");

        if(a==b){
            return true;
        }else {
            return false;
        }
    }

}
