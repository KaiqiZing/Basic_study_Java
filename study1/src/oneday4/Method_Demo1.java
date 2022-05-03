package oneday4;
/*
 修饰符 返回值类型 方法名(参数列表){
    //代码省略...
    return 结果;
 }
定义方法的两个明确
1.明确返回值类型--返回值类型必须要和return语句的返回类型相同，return意味着方法的结束，所有后面的代码不会执行
2.明确参数列表
 */
public class Method_Demo1 {
    public static void main(String[] args) {
//        明确返回值类型是int
        int  sum = getsum(5,6);
        System.out.println(sum);

//        比较两个整数是否相同
        boolean bool = compare(2,4);
        System.out.println(bool);

//        计算1-100的和
        int sum_result = sum();
        System.out.println(sum_result);
    }


    public static int getsum(int a, int b){
        return a + b;
    }

    public  static boolean compare(int a, int b){
        if (a==b){
            return true;
        }else {
            return false;
        }
    }

    public static int sum(){
        int sum = 0;
        for (int i = 1; i <=100; i++){
            sum += i;
        }
        return sum;
    }


}
