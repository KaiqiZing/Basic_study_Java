package oneday3;
/*
循环语句
 for(初始化表达式1; 布尔表达式2; 步进表达式4){ 循环体3
}
while 循环
初始化表达式1
while(布尔表达式2){
    循环体3
    步进表达式4
    }

do... while
初始化表达式1
    do{
    循环体3
    步进表达式4 }while(布尔表达式2);

Notice: for and while--for loop 结束后就不能再被访问到，既变量就从内存中消失；而while循环结束后还可以继续使用
*/

public class Loop_Statments {
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

















    }
}
