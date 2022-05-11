package oneday8;

public class Match_Demo5 {

    /*public static double abs(double a) :返回 double 值的绝对值。
    * public static double ceil(double a) :返回大于等于参数的最小的整数。
    * */
    public static void main(String[] args) {
        double d1 = Math.abs(-5);
        double d2 = Math.ceil(3.1);
        double d3 = Math.floor(3.1); // 返回小于等于参数最大的整数
        double d4 = Math.round(5.5); // 返回最接近参数的long；

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
    }

}
