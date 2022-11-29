package oneday13;

import java.util.Arrays;

public class Demo1System {
    /*
    * system类
    * public static long currentTimeMillis()返回毫秒为单位的当前时间；
    * public static void arraycopy() 将数组中指定数据拷贝到另一个数组当中；
    *  */
    public static void main(String[] args) {

        demo01();
        demo02();
    }

    private static void demo01(){
        long s = System.currentTimeMillis();
        for (int i = 1; i <=9999 ; i++) {
            System.out.println(i);

        }
        // 程序执行后获取的一次毫秒值
        long e = System.currentTimeMillis();
        System.out.println("程序耗时时间："+(e-s));

    }

    private static void demo02(){
        int[] src = {1,2,3,4,6};
        int[] desc = {3,3,4,56,7};

        System.out.println("复制前数组：" +  Arrays.toString(desc));

        System.arraycopy(src, 0, desc, 0,3);
        System.out.println("复制后数组：" + Arrays.toString(desc));

    }
}
