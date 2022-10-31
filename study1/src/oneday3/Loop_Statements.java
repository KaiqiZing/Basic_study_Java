package oneday3;

public class Loop_Statements {
    public static void main(String[] args) {
//        for loop 计算1-100之间的偶数和
        int sum = 0;
        for (int i = 1; i <= 100; i ++){
            if (i % 2==0){
                sum += i;
            }
        }
        System.out.println("1-100之间的偶数和是:"+sum);

//        while loop 1.循环输出结果 2.计算1-100之间的和
        int i = 1;
        while (i <=5){
            System.out.println("Hello   World");
            i++;
        }

        int j = 1;
        int all_sum = 0;
        while (j<=100){
            all_sum += j;
            j++;
        }
        System.out.println("1-100之间的和是："+ all_sum);

//        do...while
        int x = 1;
        do {
            System.out.println("do...while loop, Hello World");
            x++;
        }while (x<=5);


        int result_num = 0 ;
        for (int k = 1; k <=100; k++) {
            if (k % 2 == 1){
                result_num += k;
            }
        }
        System.out.println(result_num);


        //嵌套循环

        for (int y= 0; y < 5 ; y++) {
            for (int z = 0; z < 2; z++) {
                System.out.println("内循环*");
            }
            System.out.println("内循环换行标识");


        }














    }
}
