package oneday7.Demo4;

import oneday6.Student;

import java.util.ArrayList;
import java.util.Random;
/*
只有 Integer 和 Character 需要特殊记忆，其他基本类型只是首字母大写即可
byte=Byte; short=Short; int=Integer; long=Long; float=Float; double=Double;
char=Character; boolean=Boolean;
*/
public class Class_Demo4_Arraylist {
    public static void main(String[] args) {

        // 创建保存随机数的数组对象
        ArrayList<Integer> list_inter = new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i < 5; i++) {
            int number = rd.nextInt(10);
            list_inter.add(number);
        }
        System.out.println("随机生成的数组："+list_inter);


    }
}
