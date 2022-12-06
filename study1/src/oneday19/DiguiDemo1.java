package oneday19;

public class DiguiDemo1 {
    public static void main(String[] args) {
        int num = 5;
        int sum = getSum(num);
        System.out.println(sum);

    }

    public static int getSum(int num){
        if (num == 1){
            return 1;
        }
        return num + getSum(num-1);
    }
}
