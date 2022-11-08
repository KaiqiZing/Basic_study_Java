package oneday7;

import java.util.Random;

/*
* Random类生成随机数，构造方法是public Random():
* public int nextInt(int n) ：返回一个伪随机数，范围在 0 （包括）和 指定值 n （不包括）之间的
* */
public class RandomDemo {
    public static void main(String[] args) {
        Random rd = new Random()    ;
        for (int i = 0; i < 5; i++) {
            int number = rd.nextInt(5);
//            System.out.println("number:"+number);
        }

        int n = 10;
        // 获取1-n之间的随机数
        Random rn = new Random();
        int numbers = rn.nextInt(n);
        System.out.println("numbers:"+numbers);


    }
}
