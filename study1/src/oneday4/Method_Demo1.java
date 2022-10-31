package oneday4;

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
