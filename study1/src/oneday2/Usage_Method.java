package oneday2;

public class Usage_Method {
    public static void main(String[] args) {
        method_name();
        System.out.println("这是方法的调用");
        operator();
    }

    public static void method_name() {
        System.out.println("自己定义的方法，需要main调用运行");

    }
    public static void operator(){
        int i = 0;
        i = (1 == 2 ? 100:200);
        int j = 0;
        j = (2 > 1 ? 500:600);
        System.out.println("这是三元运算的False:"+ i);
        System.out.println("这是三元运算的True:"+ j);


    }
}
