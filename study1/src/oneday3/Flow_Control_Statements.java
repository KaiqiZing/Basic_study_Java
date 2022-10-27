package oneday3;
/*
if else判断语句
switch选择语句
for循环语句
while循环语句
do while循环语句
跳出语句break，continue
 */
public class Flow_Control_Statements {

    public static void main(String[] args) {

        // if 条件语句
        System.out.println("---开始if条件语句---");
        // 定义两个变量
        int a = 10;
        int b = 20;
        int c = 10;

        if(a==b){
            System.out.println("a and b is equal");
        }
        if (a==c){
            System.out.println("a and c is equal");
        }
        System.out.println("---结束if语句---");
        System.out.println();

        c = a < b ? a:b;
        System.out.println("三元运算符："+ c);



//        if else语句
        System.out.println("---开始if...else语句---");
        if (a % 2 == 1){
            System.out.println("a是偶数");
        }else{
            System.out.println("a是奇数");
        }
        System.out.println("---结束if...else语句---");
        System.out.println();


//        if...else if ...else
        int x = 5;
        int y;
        if (x >= 3) {
            y = 2 * x + 1;
        }else if (x >= -1 && x < 3){
            y = 2 * x;
        }else{
            y = 2 * x -1;
        }
        System.out.println("y值是："+y);
        System.out.println();


        int score = 50;
        if (score<0 || score>100){
            System.out.println("your score is error!");
        }else if (score>=90 && score<=100){
            System.out.println("your score is excellent");
        }else if (score>=80 && score<90){
            System.out.println("your score is good");
        }else if (score>=70 && score<80){
            System.out.println("your score is fine");
        }else if (score>=60 && score<70){
            System.out.println("your score is pass");
        }else{
            System.out.println("your score is fail");
        }



    }

}
