package oneday7;
import java.util.ArrayList;
import java.util.Random;
/*对象数组练习
*/
public class Class_Demo4_Arraylist {
    public static void main(String[] args) {
        /*生成一定范围内的随机整数，并添加到集合当中*/
        Random rd = new Random();
        ArrayList<Integer> int_list = new ArrayList<>();
        for (int i=0; i< 6; i++){
            int r = rd.nextInt(100)+1;
            int_list.add(r);
        }
        System.out.println("生成一定范围内的随机整数："+int_list);

        ArrayList<String> student_lsit = new ArrayList<>();
    }
}
