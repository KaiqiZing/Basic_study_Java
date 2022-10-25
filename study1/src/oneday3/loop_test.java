package oneday3;

public class loop_test {

    public static void main(String[] args) {


        int sum =0;
        for (int i = 0; i <= 100; i++) {
            if (i %2 == 0) {
                sum += i;
            }
        }
        System.out.println("for loop result:"+sum);


        // while
        int i = 0;
        int sum1 = 0;
        while (i <=100){
            if (i%2==0){
                sum1+=i;
            }
            i ++;
        }
        System.out.println("while loop result:" +sum1);

        // do... while   循环体和步进表达式要分开，步进表达式容易写在循环体中
        int sum2=0;
        int x=0;
        do {
            if (x % 2 == 0){
                sum2 +=x;
            }
            x++;
        }while(x<=100);
        System.out.println("do...while loop result:"+sum2);
    }
}
