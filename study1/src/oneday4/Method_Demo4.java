package oneday4;
/*
* 方法的重载（Overload）,多个方法名称一样，但是参数列表不一样；
* 好处：只需要记住唯一一个方法名称即可，就可以实现类似的功能；
* */
public class Method_Demo4 {
    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(10, 20, 30 ,40));

        // System.out.println(sum(10, 20, 30 ,40, 50)); //找不到任何方法匹配会报错；

    }
    public static int sum(int a, int b){
        System.out.println("有2个参数执行");
        return a + b;
    }

    public static int sum(int a, int b, int c){
        System.out.println("有3个参数执行");
        return a + b + c ;
    }

    public static int sum(int a, int b, int c, int d){
        System.out.println("有4个参数执行");
        return a + b + c +d;
    }

    // 错误写法，与参数的名称无关
  /*  public static int sum(int x, int y){
        System.out.println("有2个参数执行");
        return x + y;
    } */


    // 错误写法，与方法的返回值类型无关；
/*    public static double sum(int a, int b){
        System.out.println("有2个参数执行");
        return a + b;
    }*/

}
