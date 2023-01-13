package oneday7.Demo3;
import java.util.Random;
import java.util.Scanner;

/*猜数字小游戏*/
public class Class_Demo2_GameTest {
    public static void main(String[] args) {
        while (true){
            //        系统产生1-100之间的随机数
            Random rd = new Random();
            int rd_number = rd.nextInt(100) + 1;
//            键盘输入的数据
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你要猜的数字在1-100之间：");
            int guess_number = sc.nextInt();

//            开始比较这两个数；
            if (guess_number > rd_number){
                System.out.println("你猜的数据"+guess_number+"大了"+"系统随机产生的数据："+rd_number);
            }else if (guess_number < rd_number){
                System.out.println("你猜的数据"+guess_number+"小了"+"系统随机产生的数据："+rd_number);
            }else {
                System.out.println("结束程序");
                break;
            }
        }
    }
}
